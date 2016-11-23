package com.p3.t04parkfieldguide.parkfieldguidehi_fiprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class ScanMenu extends AppCompatActivity {
    private Boolean scanToggle = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_menu);

        ToggleButton toggle = (ToggleButton) findViewById(R.id.scanToggle);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    scanToggle = true;
                } else {
                    scanToggle = false;
                }
                Button btn=(Button)findViewById(R.id.moose);
                btn.setVisibility(View.INVISIBLE);

                btn=(Button)findViewById(R.id.moose2);
                btn.setVisibility(View.INVISIBLE);

                btn=(Button)findViewById(R.id.tree);
                btn.setVisibility(View.INVISIBLE);

                btn=(Button)findViewById(R.id.tree2);
                btn.setVisibility(View.INVISIBLE);
            }
        });
    }

    public void scanOnClick(View view) {
        if(scanToggle) {
            Button btn=(Button)findViewById(R.id.tree);
            btn.setVisibility(View.VISIBLE);

            btn=(Button)findViewById(R.id.tree2);
            btn.setVisibility(View.VISIBLE);
        } else {
            Button btn=(Button)findViewById(R.id.moose);
            btn.setVisibility(View.VISIBLE);

            btn=(Button)findViewById(R.id.moose2);
            btn.setVisibility(View.VISIBLE);
        }
    }

    public void openMain(View view)
    {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    // Called when user clicks the WildLife button
    public void openWildLife(View view)
    {
        Intent intent = new Intent(this, WildLifeMenu.class);
        startActivity(intent);
    }


}
