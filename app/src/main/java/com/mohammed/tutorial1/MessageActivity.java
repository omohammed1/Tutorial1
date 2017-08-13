package com.mohammed.tutorial1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(intent.getStringExtra(MainActivity.extraMessage));
    }
}
