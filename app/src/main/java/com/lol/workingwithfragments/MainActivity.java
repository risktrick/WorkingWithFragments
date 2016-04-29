package com.lol.workingwithfragments;


import android.support.v4.app.Fragment;

public class MainActivity extends SingleFragmentActivity {

    @Override
    Fragment createFragment() {
        //return new FirstFragment();
        return new CrimeListFragment();
    }
}
