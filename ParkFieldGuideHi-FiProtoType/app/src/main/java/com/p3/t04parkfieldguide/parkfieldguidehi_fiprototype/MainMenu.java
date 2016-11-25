package com.p3.t04parkfieldguide.parkfieldguidehi_fiprototype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
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

    // Called when user clicks the WildLife button
    public void openWildLife(View view)
    {
        Intent intent = new Intent(this, WildLifeMenu.class);
        startActivity(intent);
    }

    // Called when user clicks the News button
    public void openNews(View view)
    {
        Intent intent = new Intent(this, NewsMenu.class);
        startActivity(intent);
    }

    public void openScan(View view)
    {
        Intent intent = new Intent(this, ScanMenu.class);
        startActivity(intent);
    }

    public void openMap(View view)
    {
        Intent intent = new Intent(this, ParkMap.class);
        startActivity(intent);
    }
}
