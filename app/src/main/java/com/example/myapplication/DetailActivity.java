package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    String sum,merek,posisi;
    TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        show= findViewById(R.id.tv_show);
        sum = getIntent().getExtras().getString("sumber");
        merek = getIntent().getExtras().getString("merek");
        posisi = getIntent().getExtras().getString("posisi");
        show.setText(sum+"  "+merek+"  "+posisi);

    }
}
