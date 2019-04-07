package com.example.monitory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent = getIntent();

        String text = intent.getStringExtra(Main3Activity.EXTRA_TEXT);

        TextView textView = (TextView)findViewById(R.id.textView8);

        textView.setText("Beres! Sekarang "+text+" udah bisa ngecek pengguaan HP "+text+" tiap hari buat bantu "+text+"s ngatur waktu");
    }
}
