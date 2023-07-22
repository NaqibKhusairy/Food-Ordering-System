package com.order.foododeringsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    ImageView order,logout;
    LinearLayout karipap,donut,popia,samosa,cucurbadak,kuihkasturi;
    TextView Karipap,Donut,Popia,Samosa,CucurBadak,KuihKasturi;
    String kuih,name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        karipap=findViewById(R.id.karipap);
        donut=findViewById(R.id.donut);
        popia=findViewById(R.id.popia);
        samosa=findViewById(R.id.samosa);
        cucurbadak=findViewById(R.id.cucurbadak);
        kuihkasturi=findViewById(R.id.kuihkasturi);
        Karipap=findViewById(R.id.txtkaripap);
        Donut=findViewById(R.id.txtdonut);
        Popia=findViewById(R.id.txtpopia);
        Samosa=findViewById(R.id.txtsamosa);
        CucurBadak=findViewById(R.id.txtcucurbadak);
        KuihKasturi=findViewById(R.id.txtkasturi);
        order=findViewById(R.id.order);
        logout=findViewById(R.id.logout);

        name=getIntent().getStringExtra("name");

        karipap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kuih=Karipap.getText().toString();
                Intent intent = new Intent(getApplicationContext(),fooddetail.class);
                intent.putExtra("name",name);
                intent.putExtra("image",R.drawable.karipap);
                intent.putExtra("shape",kuih);
                startActivity(intent);
            }
        });

        donut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kuih=Donut.getText().toString();
                Intent intent = new Intent(getApplicationContext(),fooddetail.class);
                intent.putExtra("name",name);
                intent.putExtra("image",R.drawable.donut);
                intent.putExtra("shape",kuih);
                startActivity(intent);
            }
        });

        popia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kuih=Popia.getText().toString();
                Intent intent = new Intent(getApplicationContext(),fooddetail.class);
                intent.putExtra("name",name);
                intent.putExtra("image",R.drawable.popia);
                intent.putExtra("shape",kuih);
                startActivity(intent);
            }
        });

        samosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kuih=Samosa.getText().toString();
                Intent intent = new Intent(getApplicationContext(),fooddetail.class);
                intent.putExtra("name",name);
                intent.putExtra("image",R.drawable.samosa);
                intent.putExtra("shape",kuih);
                startActivity(intent);
            }
        });

        cucurbadak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kuih=CucurBadak.getText().toString();
                Intent intent = new Intent(getApplicationContext(),fooddetail.class);
                intent.putExtra("name",name);
                intent.putExtra("image",R.drawable.cucurbadak);
                intent.putExtra("shape",kuih);
                startActivity(intent);
            }
        });

        kuihkasturi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kuih=KuihKasturi.getText().toString();
                Intent intent = new Intent(getApplicationContext(),fooddetail.class);
                intent.putExtra("name",name);
                intent.putExtra("image",R.drawable.kuihkasturi);
                intent.putExtra("shape",kuih);
                startActivity(intent);
            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),order.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
    }
}