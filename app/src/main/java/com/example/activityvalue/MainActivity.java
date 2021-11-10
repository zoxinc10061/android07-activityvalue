package com.example.activityvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText A;
    private TextView word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A = (EditText)findViewById(R.id.A);
        word = (TextView)findViewById(R.id.word);
        Intent intent =this.getIntent();
        String A = intent.getStringExtra("B");
        word.setText(A);
    }

    public void Switch(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity2.class);
        intent.putExtra("A",A.getText().toString());
        startActivity(intent);
        MainActivity.this.finish();
    }
}