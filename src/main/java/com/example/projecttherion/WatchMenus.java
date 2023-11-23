package com.example.projecttherion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class WatchMenus extends AppCompatActivity {
    Button next11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_menus);
        next11=(Button) findViewById(R.id.button15);


        next11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WatchMenus.this, WatchProducts.class);
                startActivity(i);
            }
        });
    }
}