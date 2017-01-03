package com.rutvikkakadiya.randommethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.*;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    int i;

    public void makeToast(String string){

        Toast.makeText(MainActivity.this, string , Toast.LENGTH_SHORT).show();

    }


    public void clickGuess(View view){

        EditText textGuess = (EditText) findViewById(R.id.textGuess);

        Integer guess = Integer.parseInt(textGuess.getText().toString());

            if (i > guess) {

                makeToast("Guess a larger number!!");

            } else if (i < guess) {

                makeToast("Guess a smaller number!!");

            } else {

                 makeToast("Perfect Guess!! Try Again!");

                Random random = new Random();

                i = random.nextInt(20) + 1;
            }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();

        i = random.nextInt(20) + 1;

    }
}
