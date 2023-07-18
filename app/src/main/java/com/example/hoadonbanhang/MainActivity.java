package com.example.hoadonbanhang;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id)
        {
            case R.id.itemhoadon:
            {
                Intent intent = new Intent(MainActivity.this, Hoadonbanhang.class);
                startActivity(intent);
                break;
            }
            case R.id.itemlienhe:
            {
                Intent intent = new Intent(MainActivity.this, Lienhekhachhang.class);
                startActivity(intent);
                break;
            }
            case R.id.itemdanhsach:
            {
                Intent intent = new Intent(MainActivity.this, JsonKhachHang.class);
                startActivity(intent);
                break;
            }
            case R.id.itemchamsoc:
            {
                Intent intent = new Intent(MainActivity.this, Chamsockhachhang.class);
                startActivity(intent);
                break;
            }
            case R.id.itemthoat:
            {
                finishAffinity();
                System.exit(0);
                break;
            }
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}