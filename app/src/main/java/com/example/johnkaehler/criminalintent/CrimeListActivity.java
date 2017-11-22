package com.example.johnkaehler.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by John Kaehler on 4/20/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId(){
        return R.layout.activity_twopane;
    }
}
