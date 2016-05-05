package com.lol.workingwithfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.UUID;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment2 extends Fragment {

    public static final String EXTRA_UUID = "EXTRA_UUID";

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
        UUID uuid = (UUID) getArguments().getSerializable(EXTRA_UUID);

        Toast.makeText(getActivity(), "uuid " + uuid, Toast.LENGTH_SHORT).show();

        return inflater.inflate(R.layout.fragment_details2, container, false);
    }

}
