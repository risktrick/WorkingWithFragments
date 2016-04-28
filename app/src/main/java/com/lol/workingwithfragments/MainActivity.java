package com.lol.workingwithfragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends SingleFragmentActivity {


    @Override
    Fragment createFragment() {
        return new FirstFragment();
    }
}
