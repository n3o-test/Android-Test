package com.git.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class TestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Toast.makeText(this, "BRANCH", Toast.LENGTH_SHORT).show();
    }
}