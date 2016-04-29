package com.lol.workingwithfragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CrimeListFragment extends ListFragment {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Model> modelArray = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            modelArray.add(new Model());
        }

        MyAdapter adapter = new MyAdapter(getActivity(), android.R.layout.simple_list_item_1, modelArray);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Log.e("aaa", "click " + position);
    }

    private class MyAdapter extends ArrayAdapter<Model> {
        public MyAdapter(Context context, int resource, List<Model> objects) {
            super(context, resource, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null){
                convertView = getActivity().getLayoutInflater().inflate(R.layout.item_model, null);
            }

            Model model = getItem(position);

            TextView textView = (TextView)convertView.findViewById(R.id.textViewItem);
            textView.setText(":) " + model.uuid);

            return convertView;
        }
    }
}
