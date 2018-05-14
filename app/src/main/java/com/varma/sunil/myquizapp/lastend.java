package com.varma.sunil.myquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.MessageFormat;

import static com.varma.sunil.myquizapp.MainActivity.points;

public class lastend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lastend);

        TextView textView = findViewById(R.id.textView3);
        textView.setText(MessageFormat.format(getString(R.string._0__1), points + " ", getString(R.string.outof)));

    }

    public void finish(View view)
    {
        System.exit(0);
    }
}
