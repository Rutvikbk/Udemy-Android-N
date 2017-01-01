package com.rutvikkakadiya.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   public void currencyConvert(View view){

       EditText textCurrency = (EditText) findViewById(R.id.textCurrency);
       int i = Integer.parseInt(textCurrency.getText().toString());
       float m = (float) i/68.0f;
       Toast.makeText(this, m+"$", Toast.LENGTH_SHORT).show();

   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
