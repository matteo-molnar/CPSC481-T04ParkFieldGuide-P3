package com.p3.t04parkfieldguide.parkfieldguidehi_fiprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class ScanMenuAnimal extends AppCompatActivity {

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

    public void togglePlant(View view)
    {
        Intent intent = new Intent(this, ScanMenuPlant.class);
        startActivity(intent);
    }

    public void scan(View view)
    {
        Intent intent = new Intent(this, ScanAnimal.class);
        startActivity(intent);
    }


}
