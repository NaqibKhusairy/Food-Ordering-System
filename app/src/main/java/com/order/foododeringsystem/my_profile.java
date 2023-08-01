package com.order.foododeringsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class my_profile extends AppCompatActivity {
    String name;
    TextView textViewusername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile);
        name = getIntent().getStringExtra("name");

        textViewusername = findViewById(R.id.etName);
        textViewusername.setText(name.toUpperCase());
        textViewusername.setEnabled(false);
    }

}
