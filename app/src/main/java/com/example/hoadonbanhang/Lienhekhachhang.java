package com.example.hoadonbanhang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Lienhekhachhang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lienhekhachhang);
        EditText sdt = findViewById(R.id.txt_sdt);
        ImageButton btnsms = findViewById(R.id.btn_sms);
        Button btnback = findViewById(R.id.btn_back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        btnsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String SDT = sdt.getText().toString();
                if(SDT.isEmpty())
                {
                    Toast.makeText(Lienhekhachhang.this, "Số điện thoại không được để trống", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setData(Uri.parse("smsto:" + SDT));
                    startActivity(intent);
                }
            }
        });
    }
}