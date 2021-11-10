package com.example.activityvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText B;
    private TextView word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        B = (EditText)findViewById(R.id.B);
        word = (TextView)findViewById(R.id.word);
        Intent intent =this.getIntent();
        String A = intent.getStringExtra("A");
        word.setText(A);
    }

    public void Switch(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this,MainActivity.class);
        intent.putExtra("B",B.getText().toString());
        startActivity(intent);
        MainActivity2.this.finish();
    }
}