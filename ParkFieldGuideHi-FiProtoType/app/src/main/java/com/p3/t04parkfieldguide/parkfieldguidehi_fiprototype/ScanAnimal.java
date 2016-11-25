package com.p3.t04parkfieldguide.parkfieldguidehi_fiprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Andrew on 11/25/2016.
 */

public class ScanAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_animals_buttons);
    }

    public void openMain(View view)
    {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void togglePlant(View view)
    {
        Intent intent = new Intent(this, ScanMenuPlant.class);
        startActivity(intent);
    }

    public void mooseInfo(View view)
    {
        Intent intent = new Intent(this, MooseInfo.class);
        startActivity(intent);
    }
}
