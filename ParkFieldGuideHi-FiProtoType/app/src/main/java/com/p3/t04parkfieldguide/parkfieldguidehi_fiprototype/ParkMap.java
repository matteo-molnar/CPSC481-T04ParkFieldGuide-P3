package com.p3.t04parkfieldguide.parkfieldguidehi_fiprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ParkMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park_map);
    }

    public void clickSign(View view)
    {
        Intent intent = new Intent(this, SignInfo.class);
        startActivity(intent);
    }
}
