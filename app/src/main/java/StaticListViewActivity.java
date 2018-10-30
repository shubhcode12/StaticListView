package com.quickprogrammingtips.examples;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class StaticListViewActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // create our UI using a fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager.findFragmentById(android.R.id.content) == null) {
            com.quickprogrammingtips.examples.StaticListViewFragment fragment = com.quickprogrammingtips.examples.StaticListViewFragment.newInstance();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(android.R.id.content, fragment);
            ft.commit();
        }
        ((ActionBarActivity)this).getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}

