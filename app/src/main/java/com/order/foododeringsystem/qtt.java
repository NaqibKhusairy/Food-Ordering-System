package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class qtt extends AppCompatActivity {
    String name,option,KD,KA,KK,K1,K2,DB,DR,PK,PA,PD,SK,SA,SD,CB,KKSTURI,
            Kd,Ka,Kk,k11,k21,Db,Dr,Pk,Pa,Pd,Sk,Sa,Sd,Cb,Kksturi;
    TextView pb,pc;
    LinearLayout kd,ka,kk,k1,k2,db,dr,pk,pa,pd,sk,sa,sd,cb,kksturi;
    Button addtocard;
    ImageView back;
    Integer bkd,bka,bkk,bk1,bk2,bdb,bdr,bpk,bpa,bpd,bsk,bsa,bsd,bcb,bkksturi;
    Spinner numkd,numka,numkk,numk1,numk2,numdb,numdr,numpk,numpa,numpd,numsk,
            numsa,numsd,numcb,numkksturi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qtt);
        pb=findViewById(R.id.textView52);
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
        cb=findViewById(R.id.cucurbadak);
        kksturi=findViewById(R.id.kuihkasturi);
        addtocard=findViewById(R.id.addTocartbtn);
        back=findViewById(R.id.imageView10);
        pc=findViewById(R.id.textView);
        numkd=findViewById(R.id.numkd);
        numka=findViewById(R.id.numka);
        numkk=findViewById(R.id.numkk);
        numk1=findViewById(R.id.numk1);
        numdb=findViewById(R.id.numdb);
        numdr=findViewById(R.id.numdv);
        numpk=findViewById(R.id.numpk);
        numpa=findViewById(R.id.numpa);
        numpd=findViewById(R.id.numpd);
        numsk=findViewById(R.id.numsk);
        numsa=findViewById(R.id.numsa);
        numsd=findViewById(R.id.numsd);
        numcb=findViewById(R.id.numcb);
        numkksturi=findViewById(R.id.numkksturi);

        name=getIntent().getStringExtra("name");
        option=getIntent().getStringExtra("type");
        KD=getIntent().getStringExtra("kd");
        KA=getIntent().getStringExtra("ka");
        KK=getIntent().getStringExtra("kk");
        K1=getIntent().getStringExtra("k1");
        DB=getIntent().getStringExtra("db");
        DR=getIntent().getStringExtra("dr");
        PK=getIntent().getStringExtra("pk");
        PA=getIntent().getStringExtra("pa");
        PD=getIntent().getStringExtra("pd");
        SK=getIntent().getStringExtra("sk");
        SA=getIntent().getStringExtra("sa");
        SD=getIntent().getStringExtra("sd");
        CB=getIntent().getStringExtra("cb");
        KKSTURI=getIntent().getStringExtra("kksturi");
        Kd=getIntent().getStringExtra("hkd");
        Ka=getIntent().getStringExtra("hka");
        Kk=getIntent().getStringExtra("hkk");
        k11=getIntent().getStringExtra("hk1");
        k21=getIntent().getStringExtra("hk2");
        Db=getIntent().getStringExtra("hdb");
        Dr=getIntent().getStringExtra("hdr");
        Pk=getIntent().getStringExtra("hpk");
        Pa=getIntent().getStringExtra("hpa");
        Pd= getIntent().getStringExtra("hpd");
        Sk=getIntent().getStringExtra("hsk");
        Sa=getIntent().getStringExtra("hsa");
        Sd=getIntent().getStringExtra("hsd");
        Cb=getIntent().getStringExtra("hcb");
        Kksturi=getIntent().getStringExtra("hkksturi");

        if(!KD.equals("")||!KA.equals("")||!KK.equals("")||!K1.equals("")||
                !DB.equals("")||!DR.equals("")||!PK.equals("")||!PA.equals("")||!PD.equals("")||
                !SK.equals("")||!SA.equals("")||!SD.equals("")||!CB.equals("")||!KKSTURI.equals("")){
            pb.setVisibility(View.GONE);
            addtocard.setVisibility(View.VISIBLE);
            pc.setVisibility(View.VISIBLE);
        }
        else{
            pb.setVisibility(View.VISIBLE);
            addtocard.setVisibility(View.GONE);
            pc.setVisibility(View.GONE);
        }
        if(KD.equals("")){
            kd.setVisibility(View.GONE);
        }
        if(KA.equals("")){
            ka.setVisibility(View.GONE);
        }
        if(KK.equals("")){
            kk.setVisibility(View.GONE);
        }
        if(K1.equals("")){
            k1.setVisibility(View.GONE);
        }
        if(DB.equals("")){
            db.setVisibility(View.GONE);
        }
        if(DR.equals("")){
            dr.setVisibility(View.GONE);
        }
        if(PK.equals("")){
            pk.setVisibility(View.GONE);
        }
        if(PA.equals("")){
            pa.setVisibility(View.GONE);
        }
        if(PD.equals("")){
            pd.setVisibility(View.GONE);
        }
        if(SK.equals("")){
            sk.setVisibility(View.GONE);
        }
        if(SA.equals("")){
            sa.setVisibility(View.GONE);
        }
        if(SD.equals("")){
            sd.setVisibility(View.GONE);
        }
        if(CB.equals("")){
            cb.setVisibility(View.GONE);
        }
        if(KKSTURI.equals("")){
            kksturi.setVisibility(View.GONE);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),order2.class);
                intent.putExtra("name",name);
                intent.putExtra("type",option);
                startActivity(intent);
            }
        });

        addtocard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(KD.equals("")){
                    bkd=0;
                }
                else if(KA.equals("")){
                    bka=0;
                }
                else if(KK.equals("")){
                    bkk=0;
                }
                else if(K1.equals("")){
                    bk1=0;
                }
                else if(K2.equals("")){
                    bk2=0;
                }
                else if(DB.equals("")){
                    bdb=0;
                }
                else if(DR.equals("")){
                    bdr=0;
                }
                else if(PK.equals("")){
                    bpk=0;
                }
                else if(PA.equals("")){
                    bpa=0;
                }
                else if(PD.equals("")){
                    bpd=0;
                }
                else if(SK.equals("")){
                    bsk=0;
                }
                else if(SA.equals("")){
                    bsa=0;
                }
                else if(SD.equals("")){
                    bsd=0;
                }
                else if(CB.equals("")){
                    bcb=0;
                }
                else if(KKSTURI.equals("")){
                    bkksturi=0;
                }
                else{


                }
                //code database
                bkd=Integer.parseInt(numkd.getSelectedItem().toString());
                bka=Integer.parseInt(numka.getSelectedItem().toString());
                bkk=Integer.parseInt(numkk.getSelectedItem().toString());
                bk1=Integer.parseInt(numk1.getSelectedItem().toString());
//                bk2=Integer.parseInt(numk2.getSelectedItem().toString());
                bdb=Integer.parseInt(numdb.getSelectedItem().toString());
                bdr=Integer.parseInt(numdr.getSelectedItem().toString());
                bpk=Integer.parseInt(numpk.getSelectedItem().toString());
                bpa=Integer.parseInt(numpa.getSelectedItem().toString());
                bsk=Integer.parseInt(numsk.getSelectedItem().toString());
                bsa=Integer.parseInt(numsa.getSelectedItem().toString());
                bsd=Integer.parseInt(numsd.getSelectedItem().toString());
                bcb=Integer.parseInt(numcb.getSelectedItem().toString());
                bkksturi=Integer.parseInt(numkksturi.getSelectedItem().toString());
                bpd = Integer.parseInt(numpd.getSelectedItem().toString());

                //intent
                Intent intent = new Intent(getApplicationContext(),cart.class);
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

                intent.putExtra("bkd",String.valueOf(bkd));
                intent.putExtra("bka",String.valueOf(bka));
                intent.putExtra("bkk",String.valueOf(bkk));
                intent.putExtra("bk1",String.valueOf(bk1));
                intent.putExtra("bk2",String.valueOf(bk2));
                intent.putExtra("bdb",String.valueOf(bdb));
                intent.putExtra("bdr",String.valueOf(bdr));
                intent.putExtra("bpk",String.valueOf(bpk));
                intent.putExtra("bpa",String.valueOf(bpa));
                intent.putExtra("bsk",String.valueOf(bsk));
                intent.putExtra("bsa",String.valueOf(bsa));
                intent.putExtra("bsd",String.valueOf(bsd));
                intent.putExtra("bcb",String.valueOf(bcb));
                intent.putExtra("bkksturi",String.valueOf(bkksturi));
                intent.putExtra("bpd",String.valueOf(bpd));

                startActivity(intent);
            }
        });
    }
}