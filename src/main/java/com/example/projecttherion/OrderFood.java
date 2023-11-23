package com.example.projecttherion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderFood extends AppCompatActivity {
    Button back6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food);
        back6=(Button) findViewById(R.id.button18);


        back6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OrderFood.this, SearchBusiness.class);
                startActivity(i);
            }
        });
    }
}