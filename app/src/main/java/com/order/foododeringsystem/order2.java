package com.order.foododeringsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class order2 extends AppCompatActivity {
    String name,option;
    Button addtocart;
    ImageView back,cart;
    CheckBox kd,ka,kk,k1,k2,db,dr,pk,pa,pd,sk,sa,sd,cb,kksturi;
    String KD,KA,KK,K1,K2,DB,DR,PK,PA,PD,SK,SA,SD,CB,KKSTURI,
            Kd,Ka,Kk,k11,k21,Db,Dr,Pk,Pa,Pd,Sk,Sa,Sd,Cb,Kksturi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order2);
        addtocart=findViewById(R.id.addTocartbtn);
        back=findViewById(R.id.imageView10);
        cart=findViewById(R.id.imageView);
        kd=findViewById(R.id.karipapdaging);
        ka=findViewById(R.id.karipapayam);
        kk=findViewById(R.id.karipapkeledek);
        k1=findViewById(R.id.karipap5);
        db=findViewById(R.id.donutbiasa);
        dr=findViewById(R.id.donutredvelvet);
        pk=findViewById(R.id.popiakentang);
        pa=findViewById(R.id.popiaayam);
        pd=findViewById(R.id.popiadaging);
        sk=findViewById(R.id.samosakentang);
        sa=findViewById(R.id.samosaayam);
        sd=findViewById(R.id.samosadaging);
        cb=findViewById(R.id.cucurbadakcb);
        kksturi=findViewById(R.id.kuihkasturicb);

        name=getIntent().getStringExtra("name");
        option=getIntent().getStringExtra("type");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),order.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),cart.class);
                intent.putExtra("name",name);
                intent.putExtra("type",option);
                startActivity(intent);
            }
        });

        addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kd.isChecked()){
                    KD="KARIPAP DAGING";
                    Kd="3.00";
                }
                else if(!kd.isChecked()){
                    KD="";
                    Kd="3.00";
                }
                if(ka.isChecked()){
                    KA="KARIPAP AYAM";
                    Ka="2.50";
                }
                else if(!ka.isChecked()){
                    KA="";
                    Ka="2.50";
                }
                if(kk.isChecked()){
                    KK="KARIPAP KELEDEK";
                    Kk="2.00";
                }
                else if(!kk.isChecked()){
                    KK="";
                    Kk="2.00";
                }
                if(k1.isChecked()){
                    K1="KARIPAP SARDIN";
                    k11="2.00";
                }
                else if(!k1.isChecked()){
                    K1="";
                    k11="2.00";
                }
                if(db.isChecked()){
                    DB="DONUT BIASA";
                    Db="2.00";
                }
                else if(!db.isChecked()){
                    DB="";
                    Db="2.00";
                }
                if(dr.isChecked()){
                    DR="DONUT RED VELVET";
                    Dr="3.00";
                }
                else if(!dr.isChecked()){
                    DR="";
                    Dr="3.00";
                }
                if(pk.isChecked()){
                    PK="POPIA KENTANG";
                    Pk="2.00";
                }
                else if(!pk.isChecked()){
                    PK="";
                    Pk="2.00";
                }
                if(pa.isChecked()){
                    PA="POPIA AYAM";
                    Pa="2.50";
                }
                else if(!pa.isChecked()){
                    PA="";
                    Pa="2.50";
                }
                if(pd.isChecked()){
                    PD="POPIA DAGING";
                    Pd="3.00";
                }
                else if(!pd.isChecked()){
                    PD="";
                    Pd="3.00";
                }
                if(sk.isChecked()){
                    SK="SAMOSA KENTANG";
                    Sk="2.00";
                }
                else if(!sk.isChecked()){
                    SK="";
                    Sk="2.00";
                }
                if(sa.isChecked()){
                    SA="SAMOSA AYAM";
                    Sa="2.50";
                }
                else if(!sa.isChecked()){
                    SA="";
                    Sa="2.50";
                }
                if(sd.isChecked()){
                    SD="SAMOSA DAGING";
                    Sd="3.00";
                }
                else if(!sd.isChecked()){
                    SD="";
                    Sd="3.00";
                }
                if(cb.isChecked()){
                    CB="CUCUR BADAK";
                    Cb="3.00";
                }
                else if(!cb.isChecked()){
                    CB="";
                    Cb="3.00";
                }
                if(kksturi.isChecked()){
                    KKSTURI="KUIH KASTURI";
                    Kksturi="3.00";
                }
                else if(!kksturi.isChecked()){
                    KKSTURI="";
                    Kksturi="3.00";
                }
                Intent intent = new Intent(getApplicationContext(),qtt.class);
                intent.putExtra("name",name);
                intent.putExtra("type",option);
                intent.putExtra("kd",KD);
                intent.putExtra("ka",KA);
                intent.putExtra("kk",KK);
                intent.putExtra("k1",K1);
                intent.putExtra("db",DB);
                intent.putExtra("dr",DR);
                intent.putExtra("pk",PK);
                intent.putExtra("pa",PA);
                intent.putExtra("pd",PD);
                intent.putExtra("sk",SK);
                intent.putExtra("sa",SA);
                intent.putExtra("sd",SD);
                intent.putExtra("cb",CB);
                intent.putExtra("kksturi",KKSTURI);
                intent.putExtra("hkd",Kd);
                intent.putExtra("hka",Ka);
                intent.putExtra("hkk",Kk);
                intent.putExtra("hk1",k11);
                intent.putExtra("hk2",k21);
                intent.putExtra("hdb",Db);
                intent.putExtra("hdr",Dr);
                intent.putExtra("hpk",Pk);
                intent.putExtra("hpa",Pa);
                intent.putExtra("hpd",Pd);
                intent.putExtra("hsk",Sk);
                intent.putExtra("hsa",Sa);
                intent.putExtra("hsd",Sd);
                intent.putExtra("hcb",Cb);
                intent.putExtra("hkksturi",Kksturi);
                startActivity(intent);
            }
        });
    }
}