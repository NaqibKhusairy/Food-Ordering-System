package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class Receipt_Activity extends AppCompatActivity {
    String name;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_receipt);

            name=getIntent().getStringExtra("name");
        }
    }
