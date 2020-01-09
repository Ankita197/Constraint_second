package com.example.constrainlayoutsecond;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {
    private EditText mMessageEditText;
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    private static final String LOG_TAG = SecondActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message =
                intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        EditText textView = (EditText) findViewById(R.id.username);
        textView.setText(message);
    }
}
