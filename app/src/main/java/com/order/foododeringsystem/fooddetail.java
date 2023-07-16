package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class fooddetail extends AppCompatActivity {
    ImageView back,foodimage;
    TextView listfood,harga;
    String Listfood,Rm,name,foodname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddetail);
        back=findViewById(R.id.imageView8);
        foodimage=findViewById(R.id.imageView18);
        listfood=findViewById(R.id.textView48);
        harga=findViewById(R.id.textView52);

        name=getIntent().getStringExtra("name");
        foodimage.setImageResource(getIntent().getIntExtra("image",0));
        foodname=getIntent().getStringExtra("shape");

        if(foodname.equals("KARIPAP")){
            Listfood="KARIPAP ......";
            Rm="RM ?.00 PER PACKET";
        }
        else if(foodname.equals("DONUT")){
            Listfood="DONUT ......";
            Rm="RM ?.00 PER PACKET";
        }
        else if(foodname.equals("POPIA")){
            Listfood="POPIA ......";
            Rm="RM ?.00 PER PACKET";
        }
        else if(foodname.equals("SAMOSA")){
            Listfood="SAMOSA ......";
            Rm="RM ?.00 PER PACKET";
        }
        else if(foodname.equals("CUCUR BADAK")){
            Listfood="CUCUR BADAK";
            Rm="RM ?.00 PER PACKET";
        }
        else if(foodname.equals("KUIH KASTURI")){
            Listfood="KUIH KASTURI";
            Rm="RM ?.00 PER PACKET";
        }
        listfood.setText(Listfood);
        harga.setText(Rm);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Home.class);
                startActivity(intent);
            }
        });
    }
}