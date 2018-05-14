package com.varma.sunil.myquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

import static com.varma.sunil.myquizapp.MainActivity.points;

public class four extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }

    public void sendMessage4(View view)
    {
        Switch check =  findViewById(R.id.switch1);
        boolean checkfor1 = check.isChecked();

        if(checkfor1){


                Toast.makeText(getApplicationContext(), R.string.correct, Toast.LENGTH_SHORT).show();
            points = points + 1;

        }
        else {
            Toast.makeText(getApplicationContext(),R.string.wrong,Toast.LENGTH_SHORT).show();
        }


        Intent intent = new Intent(this, five.class);
        startActivity(intent);
        finish();
    }
}
