package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class Receipt_Activity extends AppCompatActivity {
    String name,harga;
    TextView Name,Phone,Price;
    ImageView home;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_receipt);

            name=getIntent().getStringExtra("name");
            harga=getIntent().getStringExtra("harga");

            Name=findViewById(R.id.name);
            Phone=findViewById(R.id.phone);
            Price=findViewById(R.id.price);
            home=findViewById(R.id.imageView8);

            Name.setText(name);
            Price.setText("RM "+harga);

            home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Receipt_Activity.this, Home.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }
            });
        }
    }
