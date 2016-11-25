package com.p3.t04parkfieldguide.parkfieldguidehi_fiprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Andrew on 11/25/2016.
 */

public class ScanMenuPlant extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_menu_animal);
    }

    public void openMain(View view)
    {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    // Called when user clicks the WildLife button
    public void toggleAnimal(View view)
    {
        Intent intent = new Intent(this, ScanMenuAnimal.class);
        startActivity(intent);
    }

    // Called when user clicks the WildLife button
    public void scan(View view)
    {
        Intent intent = new Intent(this, ScanPlant.class);
        startActivity(intent);
    }
}
