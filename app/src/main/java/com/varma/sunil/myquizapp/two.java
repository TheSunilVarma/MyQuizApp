package com.varma.sunil.myquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.varma.sunil.myquizapp.MainActivity.points;

public class two extends AppCompatActivity {
    String answer2 = "True";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void sendMessage2 (View view)
    {
        RadioGroup radioGroup =  findViewById(R.id.radio);

        int radioButtonID = radioGroup.getCheckedRadioButtonId();

        RadioButton radioButton = radioGroup.findViewById(radioButtonID);

        String selectedtext = (String) radioButton.getText();

        if(selectedtext.equals(answer2)){

            Toast.makeText(getApplicationContext(),R.string.correct,Toast.LENGTH_SHORT).show();
            points = points + 1;


        }
        else {
            Toast.makeText(getApplicationContext(),R.string.wrong,Toast.LENGTH_SHORT).show();
        }

        Intent intent = new Intent(this, three.class);
        startActivity(intent);
        finish();
    }
}
