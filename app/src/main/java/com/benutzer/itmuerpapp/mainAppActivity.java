package com.benutzer.itmuerpapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class mainAppActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_app, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void attendanceActivityCall(View view) {
        Intent intentAttendanceApp = new Intent(this, attendanceActivity.class);
        startActivity(intentAttendanceApp);

    }

    public void profileActivityCall(View view) {
        Intent intentProfileApp = new Intent(this, profileActivity.class);
        startActivity(intentProfileApp);
    }

    public void registerActivityCall(View view) {
        Intent intentRegisterApp = new Intent(this, registerActivity.class);
        startActivity(intentRegisterApp);
    }

    public void timeTableActivityCall(View view) {
        Intent intenttimeTableApp = new Intent(this, timeTableActivity.class);
        startActivity(intenttimeTableApp);
    }

    public void resultActivityCall(View view) {
        Intent intentResultApp = new Intent(this, resultActivity.class);
        startActivity(intentResultApp);
    }

    public void newsActivityCall(View view) {
        Intent intentNewsApp = new Intent(this, newsActivity.class);
        startActivity(intentNewsApp);
    }
}
