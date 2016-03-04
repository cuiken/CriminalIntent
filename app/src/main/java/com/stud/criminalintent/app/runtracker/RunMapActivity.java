package com.stud.criminalintent.app.runtracker;

import android.support.v4.app.Fragment;
import com.stud.criminalintent.app.SingleFragmentActivity;

/**
 * @autor Ken.Cui
 */
public class RunMapActivity extends SingleFragmentActivity {
    public static final String EXTRA_RUN_ID = "com.stud.criminalintent.run_id";

    @Override
    protected Fragment createFragment() {
        long runId = getIntent().getLongExtra(EXTRA_RUN_ID, -1);
        if (runId != -1) {
            return RunMapFragment.newInstance(runId);
        } else {
            return new RunMapFragment();
        }
    }
}
