package com.example.fmimarket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ConfirmFinalOrderActivity extends AppCompatActivity {

    private EditText nameEditText, phoneEditText, addressEditTest;
    private Button confirmOderBtn;

    private String totalAmount = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_final_order);


        confirmOderBtn = (Button) findViewById(R.id.confirm_final_order_btn);
        phoneEditText = (EditText) findViewById(R.id.shipment_phone_number);
        nameEditText = (EditText) findViewById(R.id.shipment_name);
        addressEditTest = (EditText) findViewById(R.id.shipment_address);

        totalAmount = getIntent().getStringExtra("Total Price");
        Toast.makeText(this ,"Total Price : " + totalAmount + " RON", Toast.LENGTH_SHORT).show();
    }
}
