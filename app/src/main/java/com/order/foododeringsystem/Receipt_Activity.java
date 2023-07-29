package com.order.foododeringsystem;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class Receipt_Activity extends AppCompatActivity {


        private TextView tvName, tvQuantity, tvPrice, tvTotal, tvPaymentMethod, tvContactNo, tvOrder;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_receipt);



            // Initialize TextViews from the XML layout
            //tvName = findViewById(R.id.tvName);
          //  tvQuantity = findViewById(R.id.tvQuantity);
           // tvPrice = findViewById(R.id.tvPrice);
           // tvTotal = findViewById(R.id.textViewTotal);
          //  tvPaymentMethod = findViewById(R.id.textViewPaymentMethod);
          //  tvContactNo = findViewById(R.id.tvContactNo);
          //  tvOrder = findViewById(R.id.textViewOrder);

            // Sample bill data (you can replace this with your bill data)
            String itemName = "Item 1";
            String itemQuantity = "2";
            String itemPrice = "$10";
            String total = "$20";
            String paymentMethod = "Credit Card";
            String contactNo = "123-456-7890";
            String orderDetails = "Sample Order Details:\n\n- Item 1 x 2\n- Item 2 x 3\n- Item 3 x 1";

            // Set the receipt data in the TextViews
            tvName.setText("NAME: John Doe");
            tvQuantity.setText("QUANTITY: " + itemQuantity);
            tvPrice.setText("PRICE: " + itemPrice);
            tvTotal.setText("TOTAL: " + total);
            tvPaymentMethod.setText("PAYMENT METHOD: " + paymentMethod);
            tvContactNo.setText("PHONE.NO: " + contactNo);
            tvOrder.setText(orderDetails);
        }
    }
