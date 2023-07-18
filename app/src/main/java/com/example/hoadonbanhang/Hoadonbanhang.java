package com.example.hoadonbanhang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Hoadonbanhang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoadonbanhang);
        Button btnTinhtien = findViewById(R.id.btnTinhtien);
        Button btnTinhlai = findViewById(R.id.btnTinhlai);
        Button btnThoat = findViewById(R.id.btnThoat);
        EditText txtHoten = findViewById(R.id.txtHoten);
        EditText txtSoluong = findViewById(R.id.txtSoluong);
        EditText txtDongia = findViewById(R.id.txtDongia);
        TextView txtThanhtien = findViewById(R.id.txtThanhtien);
        CheckBox VIP = findViewById(R.id.chboxVIP);
        //VIP.setChecked(true);
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.exit(0);
            }
        });
        btnTinhlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDongia.setText("");
                txtHoten.setText("");
                txtSoluong.setText("");
                txtThanhtien.setText("");
                VIP.setChecked(false);
            }
        });
        btnTinhtien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float Dongia = Float.parseFloat(txtDongia.getText().toString());
                float Soluong = Float.parseFloat(txtSoluong.getText().toString());
                if(VIP.isChecked())
                {
                    float Thanhtien = (float) (Dongia* (Soluong - Soluong * 0.1));
                    txtThanhtien.setText("" + Thanhtien);
                    Toast.makeText(Hoadonbanhang.this, "Do bạn là VIP nên được giảm 10% hoá đơn", Toast.LENGTH_LONG).show();
                }
                else
                {
                    float Thanhtien = (float) (Dongia* (Soluong + Soluong * 0.1));
                    txtThanhtien.setText("" + Thanhtien);
                }
            }
        });
    }
}