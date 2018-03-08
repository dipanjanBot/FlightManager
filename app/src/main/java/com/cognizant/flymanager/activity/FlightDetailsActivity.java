package com.cognizant.flymanager.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.android.debug.hv.ViewServer;
import com.cognizant.flymanager.BuildConfig;
import com.cognizant.flymanager.R;
import com.cognizant.flymanager.subactivity.CustomViewIconTextTabsActivity;

/**
 * Created by Dipanjan on 29-10-2017.
 */

public class FlightDetailsActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle flightbundle = getIntent().getExtras();

        setContentView(R.layout.flightdetails_list_activity);
        //savedInstanceState.getParcelableArrayList("");
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent fightIndent = new Intent(FlightDetailsActivity.this, CustomViewIconTextTabsActivity.class);
        fightIndent.putExtras(flightbundle);
        startActivity(fightIndent);


        if (BuildConfig.DEBUG)
            ViewServer.get(this).addWindow(this);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (BuildConfig.DEBUG)
            ViewServer.get(this).removeWindow(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (BuildConfig.DEBUG)
            ViewServer.get(this).setFocusedWindow(this);
    }


}
