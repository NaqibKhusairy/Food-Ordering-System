package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class order extends AppCompatActivity {
    LinearLayout pickup,delivery;
    ImageView home,logout;
    TextView Pickup,Delivery;
    String name,option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        pickup=findViewById(R.id.po);
        delivery=findViewById(R.id.d);
        home=findViewById(R.id.homepage);
        logout=findViewById(R.id.logout);
        Pickup=findViewById(R.id.textView15);
        Delivery=findViewById(R.id.textView16);

        name=getIntent().getStringExtra("name");

        pickup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),order2.class);
                option=Pickup.getText().toString();
                intent.putExtra("name",name);
                intent.putExtra("type",option);
                startActivity(intent);
            }
        });

        delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),order2.class);
                option=Delivery.getText().toString();
                intent.putExtra("name",name);
                intent.putExtra("type",option);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Home.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}