package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class my_profile extends AppCompatActivity {
    String name;
    TextView textViewusername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile);
        name = getIntent().getStringExtra("name");

        textViewusername=findViewById(R.id.textViewusername);
        textViewusername.setText("Username : "+name);
    }
}