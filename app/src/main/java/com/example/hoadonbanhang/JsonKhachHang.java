 package com.example.hoadonbanhang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

 public class JsonKhachHang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_khach_hang);
        ListView listView = findViewById(R.id.lisView);
        Button btnView = findViewById(R.id.btnView);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jsonString = "[{\"Ten\":\"Bưởi\",\"SDT\":1234567892},{\"Ten\":\"Cam\",\"SDT\":9876543210}]";
                try {
                    JSONArray jsonArray = new JSONArray(jsonString);
                    List<Khach_Hang> dsKhachHang = new ArrayList<>();
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        String Ten = jsonObject.getString("Ten");
                        String SDT = jsonObject.getString("SDT");
                        Khach_Hang khachhang = new Khach_Hang(Ten, SDT);
                        dsKhachHang.add(khachhang);
                    }
                    ArrayAdapter<Khach_Hang> adapter =
                            new ArrayAdapter<>(JsonKhachHang.this, android.R.layout.simple_list_item_1,dsKhachHang);
                    listView.setAdapter(adapter);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}