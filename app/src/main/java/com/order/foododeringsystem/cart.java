package com.order.foododeringsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class cart extends AppCompatActivity {
    String name,option,Detail,OPTion;
    TextView detail;
    Button payment;
    ImageView Back;
    LinearLayout paymentmehtod;
    TableLayout table;
    RadioGroup Option,rgpm;
    RadioButton OPtion,RGPM,pickup,delivery;
    int OPTION,RGpm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        detail=findViewById(R.id.detail);
        payment=findViewById(R.id.payment);
        Back=findViewById(R.id.imageView10);
        paymentmehtod=findViewById(R.id.LinearLayout4);
        table=findViewById(R.id.table);
        Option=findViewById(R.id.Option);
        rgpm=findViewById(R.id.rgpm);
        pickup=findViewById(R.id.pickup);
        delivery=findViewById(R.id.delivery);

        name=getIntent().getStringExtra("name");
        option=getIntent().getStringExtra("type");

        switch (option){
            case "PICK UP":
                pickup.setChecked(true);
                delivery.setChecked(false);
                break;
            case "DELIVERY":
                pickup.setChecked(false);
                delivery.setChecked(true);
                break;
        }
        pickup.setEnabled(false);
        delivery.setEnabled(false);

        Detail=detail.getText().toString();

        //detail.setText(coding database);

        if(Detail.equals("Your Cart Is Empty")){
            table.setVisibility(View.GONE);
            paymentmehtod.setVisibility(View.GONE);
            payment.setVisibility(View.GONE);
        }
        else{
            table.setVisibility(View.VISIBLE);
            paymentmehtod.setVisibility(View.VISIBLE);
            payment.setVisibility(View.VISIBLE);
        }

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),order2.class);
                intent.putExtra("name",name);
                intent.putExtra("type",option);
                startActivity(intent);
            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OPTION=Option.getCheckedRadioButtonId();
                RGpm=rgpm.getCheckedRadioButtonId();
                if(OPTION == -1){
                    Toast.makeText(getApplicationContext(), "Please select your OPTION", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(RGpm == -1){
                    Toast.makeText(getApplicationContext(), "Please select your Payment Method", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }
}