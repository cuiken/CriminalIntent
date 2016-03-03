package com.stud.criminalintent.app.runtracker;

import android.support.v4.app.Fragment;
import com.stud.criminalintent.app.SingleFragmentActivity;

/**
 * @autor Ken.Cui
 */
public class RunActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new RunFragment();
    }
}
