package com.order.foododeringsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
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

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class cart extends AppCompatActivity {
    String name, option;
    TextView detail;
    Button payment;
    ImageView Back;
    LinearLayout paymentMethod;
    TableLayout table;
    RadioGroup Option;
    RadioButton pickup, delivery;

    String KD, KA, KK, K1, K2, DB, DR, PK, PA, PD, SK, SA, SD, CB, KKSTURI,
            Kd, Ka, Kk, k11, k21, Db, Dr, Pk, Pa, Pd, Sk, Sa, Sd, Cb, Kksturi;
    TextView pb, pc, numkd, numka, numkk, numk1, numdb, numdr, numpk, numpa, numpd, numsk,
            numsa, numsd, numcb, numkksturi;
    LinearLayout kd, ka, kk, k1, k2, db, dr, pk, pa, pd, sk, sa, sd, cb, kksturi;

    ImageView back;
    String bkd, bka, bkk, bk1, bk2, bdb, bdr, bpk, bpa, bpd, bsk, bsa, bsd, bcb, bkksturi;
    Double BKD, BKA, BKK, BK1, BK2, BDB, BDR, BPK, BPA, BPD, BSK, BSA, BSD, BCB, BKKSTURI,harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        detail = findViewById(R.id.detail);
        payment = findViewById(R.id.payment);
        Back = findViewById(R.id.imageView10);
        paymentMethod = findViewById(R.id.LinearLayout4);
        table = findViewById(R.id.table);
        Option = findViewById(R.id.Option);
        pickup = findViewById(R.id.pickup);
        delivery = findViewById(R.id.delivery);

        name = getIntent().getStringExtra("name");
        option = getIntent().getStringExtra("type");


        //pb=findViewById(R.id.textView52);
        kd = findViewById(R.id.karipapdaging);
        ka = findViewById(R.id.karipapayam);
        kk = findViewById(R.id.karipapkeledek);
        k1 = findViewById(R.id.karipap5);
        db = findViewById(R.id.donutbiasa);
        dr = findViewById(R.id.donutredvelvet);
        pk = findViewById(R.id.popiakentang);
        pa = findViewById(R.id.popiaayam);
        pd = findViewById(R.id.popiadaging);
        sk = findViewById(R.id.samosakentang);
        sa = findViewById(R.id.samosaayam);
        sd = findViewById(R.id.samosadaging);
        cb = findViewById(R.id.cucurbadak);
        kksturi = findViewById(R.id.kuihkasturi);
        //addtocard=findViewById(R.id.addTocartbtn);
        back = findViewById(R.id.imageView10);
        pc = findViewById(R.id.textView);
        numkd = findViewById(R.id.numkd);
        numka = findViewById(R.id.numka);
        numkk = findViewById(R.id.numkk);
        numk1 = findViewById(R.id.numk1);

        numdb = findViewById(R.id.numdb);
        numdr = findViewById(R.id.numdv);
        numpk = findViewById(R.id.numpk);
        numpa = findViewById(R.id.numpa);
        numpd = findViewById(R.id.numpd);
        numsk = findViewById(R.id.numsk);
        numsa = findViewById(R.id.numsa);
        numsd = findViewById(R.id.numsd);
        numcb = findViewById(R.id.numcb);
        numkksturi = findViewById(R.id.numkksturi);

        name = getIntent().getStringExtra("name");
        option = getIntent().getStringExtra("type");
        KD = getIntent().getStringExtra("kd");
        KA = getIntent().getStringExtra("ka");
        KK = getIntent().getStringExtra("kk");
        K1 = getIntent().getStringExtra("k1");
        DB = getIntent().getStringExtra("db");
        DR = getIntent().getStringExtra("dr");
        PK = getIntent().getStringExtra("pk");
        PA = getIntent().getStringExtra("pa");
        PD = getIntent().getStringExtra("pd");
        SK = getIntent().getStringExtra("sk");
        SA = getIntent().getStringExtra("sa");
        SD = getIntent().getStringExtra("sd");
        CB = getIntent().getStringExtra("cb");
        KKSTURI = getIntent().getStringExtra("kksturi");
        Kd = getIntent().getStringExtra("hkd");
        Ka = getIntent().getStringExtra("hka");
        Kk = getIntent().getStringExtra("hkk");
        k11 = getIntent().getStringExtra("hk1");
        k21 = getIntent().getStringExtra("hk2");
        Db = getIntent().getStringExtra("hdb");
        Dr = getIntent().getStringExtra("hdr");
        Pk = getIntent().getStringExtra("hpk");
        Pa = getIntent().getStringExtra("hpa");
        Pd = getIntent().getStringExtra("hpd");
        Sk = getIntent().getStringExtra("hsk");
        Sa = getIntent().getStringExtra("hsa");
        Sd = getIntent().getStringExtra("hsd");
        Cb = getIntent().getStringExtra("hcb");
        Kksturi = getIntent().getStringExtra("hkksturi");


        bkd = getIntent().getStringExtra("bkd");
        bka = getIntent().getStringExtra("bka");
        bkk = getIntent().getStringExtra("bkk");
        bk1 = getIntent().getStringExtra("bk1");
        bk2 = getIntent().getStringExtra("bk2");
        bdb = getIntent().getStringExtra("bdb");
        bdr = getIntent().getStringExtra("bdr");
        bpk = getIntent().getStringExtra("bpk");
        bpa = getIntent().getStringExtra("bpa");
        bsk = getIntent().getStringExtra("bsk");
        bsa = getIntent().getStringExtra("bsa");
        bsd = getIntent().getStringExtra("bsd");
        bcb = getIntent().getStringExtra("bcb");
        bkksturi = getIntent().getStringExtra("bkksturi");
        bpd = getIntent().getStringExtra("bpd");

        BKD=Double.parseDouble(bkd);
        BKA=Double.parseDouble(bka);
        BKK=Double.parseDouble(bkk);
        BK1=Double.parseDouble(bk1);
        BDB=Double.parseDouble(bdb);
        BDR=Double.parseDouble(bdr);
        BPK=Double.parseDouble(bpk);
        BPA=Double.parseDouble(bpa);
        BPD=Double.parseDouble(bpd);
        BSK=Double.parseDouble(bsk);
        BSA=Double.parseDouble(bsa);
        BSD=Double.parseDouble(bsd);
        BCB=Double.parseDouble(bcb);
        BKKSTURI=Double.parseDouble(bkksturi);

        harga=(BKD*3.00)+(BKA*2.50)+(BKK*2.00)+(BK1*2.00)+
                (BDB*2.00)+(BDR*2.00)+(BPK*2.00)+(BPA*2.50)+(BPD*3.00)+
                (BSK*2.00)+(BSA*2.50)+(BSD*3.00)+(BCB*3.00)+(BKKSTURI*3.00);

        numkd.setText(bkd);
        numka.setText(bka);
        numkk.setText(bkk);
        numk1.setText(bk1);

        numdb.setText(bdb);
        numdr.setText(bdr);
        numpk.setText(bpk);
        numpa.setText(bpa);
        numpd.setText(bpd);
        numsk.setText(bsk);
        numsa.setText(bsa);
        numsd.setText(bsd);
        numcb.setText(bcb);
        numkksturi.setText(bkksturi);


        detail.setText("");

        if (KD.equals("")) {
            kd.setVisibility(View.GONE);
        }
        if (KA.equals("")) {
            ka.setVisibility(View.GONE);
        }
        if (KK.equals("")) {
            kk.setVisibility(View.GONE);
        }
        if (K1.equals("")) {
            k1.setVisibility(View.GONE);
        }
        if (DB.equals("")) {
            db.setVisibility(View.GONE);
        }
        if (DR.equals("")) {
            dr.setVisibility(View.GONE);
        }
        if (PK.equals("")) {
            pk.setVisibility(View.GONE);
        }
        if (PA.equals("")) {
            pa.setVisibility(View.GONE);
        }
        if (PD.equals("")) {
            pd.setVisibility(View.GONE);
        }
        if (SK.equals("")) {
            sk.setVisibility(View.GONE);
        }
        if (SA.equals("")) {
            sa.setVisibility(View.GONE);
        }
        if (SD.equals("")) {
            sd.setVisibility(View.GONE);
        }
        if (CB.equals("")) {
            cb.setVisibility(View.GONE);
        }
        if (KKSTURI.equals("")) {
            kksturi.setVisibility(View.GONE);
        }

        switch (option) {
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



        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), order2.class);
                intent.putExtra("name", name);
                intent.putExtra("type", option);
                startActivity(intent);
            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<String, String> params = new HashMap<>();
                params.put("name", name);
                params.put("bkd", bkd);
                params.put("bka", bka);
                params.put("bkk", bkk);
                params.put("bk1", bk1);
                params.put("bdb", bdb);
                params.put("bdr", bdr);
                params.put("bpk", bpk);
                params.put("bpa", bpa);
                params.put("bpd", bpd);
                params.put("bsk", bsk);
                params.put("bsa", bsa);
                params.put("bsd", bsd);
                params.put("bcb", bcb);
                params.put("bkksturi", bkksturi);
                params.put("option", option);
                params.put("harga", String.format("%.2f", harga));
                cart(params);
            }
        });
    }

    private void cart(HashMap<String, String> params) {
        final ProgressDialog progressDialog = new ProgressDialog(cart.this);
        progressDialog.setTitle("Please wait");
        progressDialog.setMessage("Registering...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        NetworkService networkService = NetworkClient.getClient().create(NetworkService.class);
        Call<CartResponseModel> cartCall = networkService.cart(params);
        cartCall.enqueue(new Callback<CartResponseModel>() {
            @Override
            public void onResponse(@NonNull Call<CartResponseModel> call, @NonNull Response<CartResponseModel> response) {
                progressDialog.dismiss();

                if (response.isSuccessful()) {
                    CartResponseModel responseBody = response.body();
                    if (responseBody != null) {
                        if (responseBody.getSuccess().equals("1")) {
                            Toast.makeText(cart.this, responseBody.getMessage(), Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(cart.this, Receipt_Activity.class);
                            intent.putExtra("name",name);
                            intent.putExtra("harga",String.format("%.2f", harga));
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(cart.this, responseBody.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(cart.this, "Response body is empty", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(cart.this, "Error: " + response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<CartResponseModel> call, @NonNull Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(cart.this, "Network request failed: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}