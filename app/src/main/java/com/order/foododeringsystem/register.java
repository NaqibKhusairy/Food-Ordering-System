package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class register extends AppCompatActivity {
    EditText Name,Ic,Age,Email,Phone,Password,Address;
    RadioGroup Gender;
    RadioButton GENDER;
    String name,ic,age,gender,email,phone,password,address;
    int GENder;
    Button submit,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Name=findViewById(R.id.etName);
        Ic=findViewById(R.id.etic);
        Age=findViewById(R.id.etage);
        Email=findViewById(R.id.etmail);
        Phone=findViewById(R.id.etphone);
        Password=findViewById(R.id.etPass);
        Address=findViewById(R.id.etaddress);
        Gender=findViewById(R.id.rgGender);
        submit=findViewById(R.id.btnSubmit);
        back=findViewById(R.id.btnBack);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = Name.getText().toString();
                ic = Ic.getText().toString();
                age = Age.getText().toString();
                GENder = Gender.getCheckedRadioButtonId();

                // Check if any radio button is selected
                if (GENder == -1) {
                    Toast.makeText(getApplicationContext(), "Please select your gender", Toast.LENGTH_SHORT).show();
                    return;
                }

                GENDER = findViewById(GENder);
                gender = GENDER.getText().toString();
                email = Email.getText().toString();
                phone = Phone.getText().toString();
                password = Password.getText().toString();
                address = Address.getText().toString();

                if(name.equals("")){
                    Toast.makeText(getApplicationContext(), "Please enter Your Name", Toast.LENGTH_SHORT).show();
                }
                else if(ic.equals("")){
                    Toast.makeText(getApplicationContext(), "Please enter Your Ic", Toast.LENGTH_SHORT).show();
                }
                else if(age.equals("")){
                    Toast.makeText(getApplicationContext(), "Please enter Your Age", Toast.LENGTH_SHORT).show();
                }
                else if(email.equals("")){
                    Toast.makeText(getApplicationContext(), "Please enter Your Email", Toast.LENGTH_SHORT).show();
                }
                else if(phone.equals("")){
                    Toast.makeText(getApplicationContext(), "Please enter Your Phone", Toast.LENGTH_SHORT).show();
                }
                else if(password.equals("")){
                    Toast.makeText(getApplicationContext(), "Please enter Your Password", Toast.LENGTH_SHORT).show();
                }
                else if(address.equals("")){
                    Toast.makeText(getApplicationContext(), "Please enter Your Address", Toast.LENGTH_SHORT).show();
                }
                else{
                    //codding database

                    //intent
                    Intent intent = new Intent(getApplicationContext(),Home.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}