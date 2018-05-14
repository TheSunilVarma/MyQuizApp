package com.varma.sunil.myquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.varma.sunil.myquizapp.MainActivity.points;

public class five extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
    }

    public void sendMessage5(View view)
    {

        EditText text = findViewById(R.id.editText);
        String selectedtext = String.valueOf(text.getText());

        if(selectedtext.equalsIgnoreCase(getString(R.string.chrome))){
            Toast.makeText(getApplicationContext(),R.string.correct,Toast.LENGTH_SHORT).show();
            points = points + 1;

        }
        else {
            Toast.makeText(getApplicationContext(),R.string.wrong,Toast.LENGTH_SHORT).show();

        }

        Intent intent = new Intent(this, lastend.class);
        startActivity(intent);
        finish();
    }

}
