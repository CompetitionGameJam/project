package com.example.xroms.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewJoinActivity extends FullScreenActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_join);
        setMContentView(findViewById(R.id.llContentNJ));

        Button back = findViewById(R.id.btnNJBack);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                NewJoinActivity.super.onBackPressed();
            }
        });

        Button create = findViewById(R.id.btnNJNew);
        Button join = findViewById(R.id.btnNJJoin);

        create.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(NewJoinActivity.this, HostActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
