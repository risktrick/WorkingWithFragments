package com.lol.workingwithfragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.UUID;


public class FirstFragment extends Fragment {


    public static final String EXTRA_UUID = "EXTRA_UUID";

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_first, container, false);

        UUID uuid = (UUID)getActivity().getIntent().getSerializableExtra(EXTRA_UUID);

        TextView textView = (TextView) root.findViewById(R.id.tvFirstFragment);
        textView.setText("uuid " + uuid);

        return root;
    }

}
