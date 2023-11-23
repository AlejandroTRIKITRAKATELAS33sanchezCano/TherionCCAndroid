package com.example.projecttherion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SearchBusiness extends AppCompatActivity {
    Button next8;
    Button next9;
    Button next10;
    ImageButton back4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_business);
        back4=(ImageButton) findViewById(R.id.imageButton);


        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchBusiness.this, WatchMenus.class);
                startActivity(i);
            }
        });
        next8=(Button) findViewById(R.id.button16);


        next8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchBusiness.this, WatchMenus.class);
                startActivity(i);
            }
        });
        next9=(Button) findViewById(R.id.button17);


        next9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchBusiness.this, WatchMenus.class);
                startActivity(i);
            }
        });
        next10=(Button) findViewById(R.id.button18);


        next10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchBusiness.this, WatchMenus.class);
                startActivity(i);
            }
        });
    }


}