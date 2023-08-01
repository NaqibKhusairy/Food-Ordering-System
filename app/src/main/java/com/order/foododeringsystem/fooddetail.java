package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class fooddetail extends AppCompatActivity {
    ImageView back,foodimage;
    TextView listfood;
    String Listfood,name,foodname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddetail);
        back=findViewById(R.id.imageView8);
        foodimage=findViewById(R.id.imageView18);
        listfood=findViewById(R.id.textView48);

        name=getIntent().getStringExtra("name");
        foodimage.setImageResource(getIntent().getIntExtra("image",0));
        foodname=getIntent().getStringExtra("shape");

        if(foodname.equals("KARIPAP")){
            Listfood="KARIPAP DAGING RM 3.00 PER PACKET\n" +
                    "KARIPAP AYAM RM 2.50 PER PACKET" +
                    "\nKARIPAP KELEDEK RM 2.00 PER PACKET\n" +
                    "KARIPAP SARDIIN RM 2.00 PER PACKET";
        }
        else if(foodname.equals("DONUT")){
            Listfood="DONUT BIASA  RM 2.00 PER PACKET" +
                    "\nDONUT RED VELVET  RM 2.00 PER PACKET";
        }
        else if(foodname.equals("POPIA")){
            Listfood="POPIA DAGING RM 3.00 PER PACKET\n"+
                    "POPIA AYAM RM 2.50 PER PACKET\n" +
                    "POPIA KELEDEK RM 2.00 PER PACKET";
        }
        else if(foodname.equals("SAMOSA")){
            Listfood="SAMOSA DAGING RM 3.00 PER PACKET\n"+
                    "SAMOSA AYAM RM 2.50 PER PACKET\n" +
                    "SAMOSA KELEDEK RM 2.00 PER PACKET";
        }
        else if(foodname.equals("CUCUR BADAK")){
            Listfood="CUCUR BADAK RM 3.00 PER PACKET";
        }
        else if(foodname.equals("KUIH KASTURI")){
            Listfood="KUIH KASTURI RM 3.00 PER PACKET";
        }
        listfood.setText(Listfood);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Home.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
    }
}