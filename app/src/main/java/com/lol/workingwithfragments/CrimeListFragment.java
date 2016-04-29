package com.lol.workingwithfragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class CrimeListFragment extends ListFragment {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Model> modelArray = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            modelArray.add(new Model());
        }

        ArrayAdapter<Model> adapter = new ArrayAdapter<Model>(getActivity(), android.R.layout.simple_list_item_1, modelArray);
        setListAdapter(adapter);
    }
}
