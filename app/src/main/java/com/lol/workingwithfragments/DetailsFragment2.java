package com.lol.workingwithfragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.UUID;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment2 extends Fragment {

    public static final String EXTRA_UUID = "EXTRA_UUID";
    public static final int REQUEST_TEXT = 0;

    TextView textViewDetailsFragment2;

    public DetailsFragment2() {
    }

    public static DetailsFragment2 newInstance(UUID uuid){
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_UUID, uuid);

        DetailsFragment2 fragment = new DetailsFragment2();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final UUID uuid = (UUID) getArguments().getSerializable(EXTRA_UUID);

        View root = inflater.inflate(R.layout.fragment_details2, container, false);
        textViewDetailsFragment2 = (TextView)root.findViewById(R.id.textViewDetailsFragment2);
        textViewDetailsFragment2.setText("uuid" + uuid);


        Button button = (Button)root.findViewById(R.id.buttonShowDitailsDialog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                DetailsDialogFragment dialogFragment = DetailsDialogFragment.newInstance("uuid" + uuid);
                dialogFragment.setTargetFragment(DetailsFragment2.this, REQUEST_TEXT);
                dialogFragment.show(fm, "mmm");
            }
        });

        return root;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        textViewDetailsFragment2.setText("entered: " + intent.getStringExtra(DetailsDialogFragment.EXTRA_ENTERED_TEXT));
    }
}
