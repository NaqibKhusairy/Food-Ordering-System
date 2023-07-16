package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Name,Password;
    Button login,register;
    String name,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=findViewById(R.id.etName);
        Password=findViewById(R.id.etPass);
        login=findViewById(R.id.btnlogin);
        register=findViewById(R.id.btnReg);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=Name.getText().toString();
                password=Password.getText().toString();

                if(name.equals("")&&password.equals("")){
                    Toast.makeText(getApplicationContext(), "Please enter your username and password", Toast.LENGTH_SHORT).show();
                }
                else {
                    //letak codding database
                    //intent
                    Intent intent = new Intent(getApplicationContext(),Home.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),register.class);
                startActivity(intent);
            }
        });
    }
}