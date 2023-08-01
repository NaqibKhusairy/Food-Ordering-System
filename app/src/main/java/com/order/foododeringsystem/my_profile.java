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
    String name, phone_num;
    TextView textViewusername, txt_ic_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile);
        name = getIntent().getStringExtra("name");
        textViewusername = findViewById(R.id.textViewusername);
        txt_ic_no = findViewById(R.id.txt_ic_no);
        textViewusername.setText("Username: " + name);

        // Call the method to fetch the profile details
        getProfile();
    }

    private void getProfile() {
        NetworkService networkService = NetworkClient.getClient().create(NetworkService.class);
        Call<ProfilResponseModel> profile = networkService.profil(name);
        profile.enqueue(new Callback<ProfilResponseModel>() {
            @Override
            public void onResponse(@NonNull Call<ProfilResponseModel> call, @NonNull Response<ProfilResponseModel> response) {
                if (response.isSuccessful()) {
                    ProfilResponseModel responseBody = response.body();
                    if (responseBody != null && responseBody.getSuccess().equals("1")) {
                        phone_num = responseBody.getPhoneNumber();
                        txt_ic_no.setText("Phone Number: " + phone_num);
                    } else {
                        Toast.makeText(my_profile.this, "Profile not found", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(my_profile.this, "Failed to get profile", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<ProfilResponseModel> call, @NonNull Throwable t) {
                Toast.makeText(my_profile.this, "Network error"+t, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
