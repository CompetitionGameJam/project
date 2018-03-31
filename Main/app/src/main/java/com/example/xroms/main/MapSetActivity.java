package com.example.xroms.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapSetActivity extends FullScreenActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_set);
        setMContentView(findViewById(R.id.llContentMS));

        Button start = findViewById(R.id.btnStart);
        start.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MapSetActivity.this, MapsActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
