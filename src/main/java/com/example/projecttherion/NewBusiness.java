package com.example.projecttherion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewBusiness extends AppCompatActivity {
    Button back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_business);
        back1=(Button) findViewById(R.id.registrarClienteButton);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewBusiness.this, Menu.class);
                startActivity(i);
            }
        });
    }
}