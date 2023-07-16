package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class order2 extends AppCompatActivity {
    String name,option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order2);
        name=getIntent().getStringExtra("name");
        option=getIntent().getStringExtra("type");
    }
}