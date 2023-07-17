package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class cart extends AppCompatActivity {
    String name,option;
    TextView detail;
    Button payment;
    ImageView Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        detail=findViewById(R.id.detail);
        payment=findViewById(R.id.payment);
        Back=findViewById(R.id.imageView10);

        name=getIntent().getStringExtra("name");
        option=getIntent().getStringExtra("type");

        //detail.setText(coding database);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),order2.class);
                intent.putExtra("name",name);
                intent.putExtra("type",option);
                startActivity(intent);
            }
        });
    }
}