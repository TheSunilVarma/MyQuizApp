package com.varma.sunil.myquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.varma.sunil.myquizapp.MainActivity.points;

public class three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);


    }

    public void sendMessage3 (View view)
    {
        CheckBox check1 =  findViewById(R.id.checkBox1);
        CheckBox answer =  findViewById(R.id.checkBox2);
        CheckBox check3 =  findViewById(R.id.checkBox3);
        CheckBox check4 =  findViewById(R.id.checkBox4);
        boolean checkfor1 = check1.isChecked();
        boolean checkfor2 = answer.isChecked();
        boolean checkfor3 = check3.isChecked();
        boolean checkfor4 = check4.isChecked();

     //   String selectedtext = (String) answer.getText();

        if(checkfor2){

            if(checkfor1 | checkfor3 | checkfor4)
            {
                Toast.makeText(getApplicationContext(),R.string.wrong,Toast.LENGTH_SHORT).show();
            }

            else {
                Toast.makeText(getApplicationContext(), R.string.correct, Toast.LENGTH_SHORT).show();
                points = points + 1;
            }

        }
        else {
            Toast.makeText(getApplicationContext(),R.string.wrong,Toast.LENGTH_SHORT).show();
        }

        Intent intent = new Intent(this, four.class);
        startActivity(intent);
        finish();
    }
}
