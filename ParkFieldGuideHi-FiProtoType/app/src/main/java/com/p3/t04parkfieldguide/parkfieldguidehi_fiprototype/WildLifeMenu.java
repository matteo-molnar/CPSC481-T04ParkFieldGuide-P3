package com.p3.t04parkfieldguide.parkfieldguidehi_fiprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class WildLifeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wild_life_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void clickMooseButton(View view)
    {
        Intent intent = new Intent(this, MooseInfo.class);
        startActivity(intent);
    }

    public void clickBirchButton(View view)
    {
        Intent intent = new Intent(this, BirchInfo.class);
        startActivity(intent);
    }
}
