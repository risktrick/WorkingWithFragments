package com.lol.workingwithfragments;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailsActivity extends SingleFragmentActivity {

    @Override
    Fragment createFragment() {
        return new FirstFragment();
    }
}
