package com.example.projecttherion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WatchProducts extends AppCompatActivity {
    Button next15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_products);
        next15=(Button) findViewById(R.id.button25);


        next15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WatchProducts.this, OrderFood.class);
                startActivity(i);
            }
        });
    }
}