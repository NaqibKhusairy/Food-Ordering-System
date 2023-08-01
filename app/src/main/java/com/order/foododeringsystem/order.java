package com.order.foododeringsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class order extends AppCompatActivity {
    LinearLayout pickup,delivery;
    ImageView home,logout;
    TextView Pickup,Delivery;
    String name,option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        pickup=findViewById(R.id.po);
        delivery=findViewById(R.id.d);
        home=findViewById(R.id.homepage);
        logout=findViewById(R.id.logout);
        Pickup=findViewById(R.id.textView15);
        Delivery=findViewById(R.id.textView16);

        name=getIntent().getStringExtra("name");

        pickup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),order2.class);
                option=Pickup.getText().toString();
                intent.putExtra("name",name);
                intent.putExtra("type","PICK UP");
                startActivity(intent);
            }
        });

        delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),order2.class);
                option=Delivery.getText().toString();
                intent.putExtra("name",name);
                intent.putExtra("type","DELIVERY");
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Home.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_menu, menu);
        MenuItem item1 = menu.findItem(R.id.item1);
        item1.setVisible(false);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item){
        // Handle menu item clicks here.
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.item2:
                Intent intent = new Intent(getApplicationContext(),Admin_page.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}