package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class Receipt_Activity extends AppCompatActivity {
    String name,harga,output;
    TextView Name,OrderDetail,Price,Option;
    ImageView home;
    String bkd, bka, bkk, bk1, bk2, bdb, bdr, bpk, bpa, bpd, bsk, bsa, bsd, bcb, bkksturi,option;
    String BKD, BKA, BKK, BK1, BDB, BDR, BPK, BPA, BPD, BSK, BSA, BSD, BCB, BKKSTURI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        name=getIntent().getStringExtra("name");
        harga=getIntent().getStringExtra("harga");
        bkd=getIntent().getStringExtra("bkd");
        bka=getIntent().getStringExtra("bka");
        bkk=getIntent().getStringExtra("bkk");
        bk1=getIntent().getStringExtra("bk1");
        bdb=getIntent().getStringExtra("bdb");
        bdr=getIntent().getStringExtra("bdr");
        bpk=getIntent().getStringExtra("bpk");
        bpa=getIntent().getStringExtra("bpa");
        bpd=getIntent().getStringExtra("bpd");
        bsk=getIntent().getStringExtra("bsk");
        bsa=getIntent().getStringExtra("bsa");
        bsd=getIntent().getStringExtra("bsd");
        bcb=getIntent().getStringExtra("bcb");
        bkksturi=getIntent().getStringExtra("bkksturi");
        option=getIntent().getStringExtra("option");

        Name=findViewById(R.id.name);
        Price=findViewById(R.id.price);
        home=findViewById(R.id.imageView8);
        OrderDetail=findViewById(R.id.textView4);
        Option=findViewById(R.id.price2);

        Name.setText(name);
        Price.setText("RM "+harga);
        Option.setText(option);

        if(bkd.equals("0")){
            BKD="";
        }
        else{
            BKD="KARIPAP DAGING "+bkd+"\n";
        }
        if(bka.equals("0")){
            BKA="";
        }
        else{
            BKA="KARIPAP AYAM "+bka+"\n";
        }
        if(bkk.equals("0")){
            BKK="";
        }
        else{
            BKK="KARIPAP KENTANG "+bkk+"\n";
        }
        if(bk1.equals("0")){
            BK1="";
        }
        else{
            BK1="KARIPAP SARDIN "+bk1+"\n";
        }
        if(bdb.equals("0")){
            BDB="";
        }
        else{
            BDB="DONUT BIASA "+bkd+"\n";
        }
        if(bdr.equals("0")){
            BDR="";
        }
        else{
            BDR="DONUT RED VELVET "+bka+"\n";
        }
        if(bpk.equals("0")){
            BPK="";
        }
        else{
            BPK="POPIA KENTANG "+bkk+"\n";
        }
        if(bpa.equals("0")){
            BPA="";
        }
        else{
            BPA="POPIA AYAM "+bk1+"\n";
        }
        if(bpd.equals("0")){
            BPD="";
        }
        else{
            BPD="POPIA DAGING "+bkd+"\n";
        }
        if(bsk.equals("0")){
            BSK="";
        }
        else{
            BSK="SAMOSA KENTANG "+bka+"\n";
        }
        if(bsa.equals("0")){
            BSA="";
        }
        else{
            BSA="SAMOSA AYAM "+bkk+"\n";
        }
        if(bsd.equals("0")){
            BSD="";
        }
        else{
            BSD="SAMOSA DAGING "+bk1+"\n";
        }
        if(bcb.equals("0")){
            BCB="";
        }
        else{
            BCB="CUCUR BADAK "+bkd+"\n";
        }
        if(bkksturi.equals("0")){
            BKKSTURI="";
        }
        else{
            BKKSTURI="KUIH KASTURI "+bka+"\n";
        }

        output=BKD+BKA+BKK+BK1+BDB+BDR+BPK+BPA+BPD+BSK+BSA+BSD+BCB+BKKSTURI;

        OrderDetail.setText(output);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Receipt_Activity.this, Home.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
    }
}
