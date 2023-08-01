package com.order.foododeringsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_menu, menu);
        MenuItem item1 = menu.findItem(R.id.item2);
        item1.setVisible(false);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item){
        // Handle menu item clicks here.
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.item1:
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}