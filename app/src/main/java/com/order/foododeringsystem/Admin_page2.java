package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin_page2 extends AppCompatActivity {
    Button Update,Delete,View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page2);
        Update=findViewById(R.id.btnUpdate);
        Delete=findViewById(R.id.btnDeleteUser);
        View=findViewById(R.id.btnViewOrderDetails);
        
        Update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent(Admin_page2.this, editUserProfil.class);
                startActivity(intent);
            }
        });

        Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent(Admin_page2.this, DeleteUser.class);
                startActivity(intent);
            }
        });

        View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent(Admin_page2.this, ViewOrder.class);
                startActivity(intent);
            }
        });
    }
}