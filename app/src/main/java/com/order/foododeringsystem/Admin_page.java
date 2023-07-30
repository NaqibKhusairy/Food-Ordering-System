package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Admin_page extends AppCompatActivity {

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";

    private EditText etAdminUsername, etAdminPassword;
    private Button btnAdminLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);

        etAdminUsername = findViewById(R.id.etAdminUsername);
        etAdminPassword = findViewById(R.id.etAdminPassword);
        btnAdminLogin = findViewById(R.id.etButtonAdmin);

        btnAdminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered username and password
                String name = etAdminUsername.getText().toString();
                String password = etAdminPassword.getText().toString();

                // Check if name and password are not empty
                if (!name.isEmpty() && !password.isEmpty()) {
                    if(name.equals(ADMIN_USERNAME)&&password.equals(ADMIN_PASSWORD)) {
                        // Start the order activity and pass the name as an extra
                        Intent intent = new Intent(Admin_page.this, Admin_page2.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(Admin_page.this, "Please enter the correct name and password", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    // Show a message if either name or password is empty
                    Toast.makeText(Admin_page.this, "Please enter name and password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}