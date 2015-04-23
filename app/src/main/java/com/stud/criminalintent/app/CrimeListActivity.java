package com.stud.criminalintent.app;

import android.support.v4.app.Fragment;

/**
 * @autor Ken.Cui
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
