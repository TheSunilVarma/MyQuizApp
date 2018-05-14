
package com.varma.sunil.myquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static int points = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void sendMessage1(View view) {
        RadioGroup radioGroup = findViewById(R.id.radio);
        //      RadioButton radioBtn =  findViewById(R.id.radioButton1);

        //   int radioButtonID = radioGroup.getCheckedRadioButtonId();

        //   RadioButton radioButton = radioGroup.findViewById(radioButtonID);

        //   String selectedtext = (String) radioButton.getText();

//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                RadioButton rb = findViewById(checkedId);
//                Toast.makeText(getApplicationContext(),rb.getText(),Toast.LENGTH_SHORT).show();
//
//            }
//        });

        //  Toast.makeText(getApplicationContext(),selectedtext,Toast.LENGTH_SHORT).show();

//        if (Integer.parseInt(selectedtext) != -1){
        //   try {
        if (radioGroup.getCheckedRadioButtonId() == R.id.radioButton1) {


            points = points + 1;
            Toast.makeText(getApplicationContext(), R.string.correct, Toast.LENGTH_SHORT).show();


        } else {
            Toast.makeText(getApplicationContext(), R.string.wrong, Toast.LENGTH_SHORT).show();

        }
        //  }
//        catch (Exception e){
//            Toast.makeText(getApplicationContext(), "exception", Toast.LENGTH_SHORT).show();
//
//        }


//        radioGroup.check(radioButtonID);
//
//        if(radioGroup.getCheckedRadioButtonId() == -1)
//        {
//            Intent intent = new Intent(this, two.class);
//            startActivity(intent);
//            finish();
//
//        }


        Intent intent = new Intent(this, two.class);
        startActivity(intent);
        finish();

    }


}
