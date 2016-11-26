package com.p3.t04parkfieldguide.parkfieldguidehi_fiprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class ScanMenu extends AppCompatActivity {
    Button moose1 = (Button)findViewById(R.id.moose);
    Button moose2 = (Button)findViewById(R.id.moose2);
    Button birch1 = (Button)findViewById(R.id.tree);
    Button birch2 = (Button)findViewById(R.id.tree2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_menu);
    }

    public void scanTogglePressed(View view) {
        moose1.setVisibility(View.INVISIBLE);
        moose2.setVisibility(View.INVISIBLE);
        birch1.setVisibility(View.INVISIBLE);
        birch2.setVisibility(View.INVISIBLE);
    }

    public void scanOnClick(View view) {
        boolean checked = ((ToggleButton)findViewById(R.id.scanToggle)).isChecked();
        if(checked) {
            birch1.setVisibility(View.VISIBLE);
            birch2.setVisibility(View.VISIBLE);
        } else {
            moose1.setVisibility(View.VISIBLE);
            moose2.setVisibility(View.VISIBLE);
        }
    }

    public void openMain(View view)
    {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void openMoose(View view)
    {
        Intent intent = new Intent(this, MooseInfo.class);
        startActivity(intent);
    }

    public void openBirch(View view)
    {
        Intent intent = new Intent(this, BirchInfo.class);
        startActivity(intent);
    }


}
