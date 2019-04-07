package com.example.monitory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    private Button button;

    public static final String EXTRA_TEXT = "com.example.monitory.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }
    public void openActivity4(){
        EditText editText = (EditText)findViewById(R.id.editText);
        String text = editText.getText().toString();


        Intent intent = new Intent(this, Main4Activity. class);
        intent.putExtra(EXTRA_TEXT, text);
        startActivity(intent);
    }
}
