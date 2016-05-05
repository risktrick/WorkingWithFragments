package com.lol.workingwithfragments;

import android.support.v4.app.Fragment;

import java.util.UUID;

public class DetailsActivity extends SingleFragmentActivity {

    @Override
    Fragment createFragment() {

        UUID uuid = (UUID)getIntent().getSerializableExtra(DetailsFragment2.EXTRA_UUID);
        return DetailsFragment2.newInstance(uuid);

        //return new DetailsFragment1();
    }
}
