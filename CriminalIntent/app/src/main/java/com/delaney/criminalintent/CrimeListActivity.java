package com.delaney.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Reid on 10/13/2015.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
