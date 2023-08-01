package com.order.foododeringsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class editUserProfil extends AppCompatActivity {
    EditText Name,Ic,Age,Email,Phone,Address;
    RadioGroup Gender;
    RadioButton GENDER;

    String name,ic,age,gender,email,phone,password,address;
    int GENder;
    Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user_profil);
        Name = findViewById(R.id.etName);
        Ic = findViewById(R.id.etic);
        Age = findViewById(R.id.etage);
        Email = findViewById(R.id.etmail);
        Phone = findViewById(R.id.etphone);
        Address = findViewById(R.id.etaddress);
        Gender = findViewById(R.id.rgGender);
        update = findViewById(R.id.btnUpdate);

        update.setOnClickListener(new View.OnClickListener() {
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
                address = Address.getText().toString();

                if (name.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter Your Name", Toast.LENGTH_SHORT).show();
                } else if (ic.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter Your Ic", Toast.LENGTH_SHORT).show();
                } else if (age.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter Your Age", Toast.LENGTH_SHORT).show();
                } else if (email.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter Your Email", Toast.LENGTH_SHORT).show();
                } else if (phone.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter Your Phone", Toast.LENGTH_SHORT).show();
                } else if (address.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter Your Address", Toast.LENGTH_SHORT).show();
                } else {
                    //codding database
                    HashMap<String, String> params = new HashMap<>();
                    params.put("name", name);
                    params.put("ic", ic);
                    params.put("age", age);
                    params.put("gender", gender);
                    params.put("email", email);
                    params.put("phone", phone);
                    params.put("address", address);
                    editUserProfil(params);

                }
            }
        });
    }

        private void editUserProfil(HashMap<String, String> params) {
            final ProgressDialog progressDialog = new ProgressDialog(editUserProfil.this);
            progressDialog.setTitle("Please wait");
            progressDialog.setMessage("Registering...");
            progressDialog.setCancelable(false);
            progressDialog.show();

            NetworkService networkService = NetworkClient.getClient().create(NetworkService.class);
            Call<editUserProfilResponseModel> editUserProfilCall = networkService.editUserProfil(params);
            editUserProfilCall.enqueue(new Callback<editUserProfilResponseModel>() {
                @Override
                public void onResponse(@NonNull Call<editUserProfilResponseModel> call, @NonNull Response<editUserProfilResponseModel> response) {
                    editUserProfilResponseModel responseBody = response.body();
                    if (responseBody != null) {
                        if (responseBody.getSuccess().equals("1")) {
                            Toast.makeText(editUserProfil.this, responseBody.getMessage(), Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(editUserProfil.this, Admin_page2.class);
                            startActivity(intent);
                            finish();
                        } else if (responseBody.getSuccess().equals("0")) {
                            Toast.makeText(getApplicationContext(), responseBody.getMessage(), Toast.LENGTH_SHORT).show();
                        } else if (responseBody.getSuccess().equals("2")) {
                            Toast.makeText(getApplicationContext(), responseBody.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                    progressDialog.dismiss();
                }


                @Override
                public void onFailure(@NonNull Call<editUserProfilResponseModel> call, @NonNull Throwable t) {
                    progressDialog.dismiss();
                }
            });
        }
    }
