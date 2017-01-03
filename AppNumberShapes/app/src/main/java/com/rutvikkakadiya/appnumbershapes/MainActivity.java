package com.rutvikkakadiya.appnumbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    class Shape{

        public boolean triangularShape(int n) {
            int i=1,y=1,t=0;
            while(y<=n){
                if(y==n){
                    t++;
                    break;
                }
                i++;
                y=y+i;
            }
            if(t>0){
                return true;
            }else{
                return false;
            }

        }

        public boolean squareShape(int n) {
            int i=1,s=0;
            while(i<=n){
                if((i*i)==n) {
                    s++;
                    break;
                }
                i++;
            }
            if(s>0){
                return true;
            }else{
                return false;
            }

        }
        public void makeToast(String string){
            Toast.makeText(MainActivity.this, string , Toast.LENGTH_SHORT).show();
        }
    }



        public void checkNumber(View view){
            try {
                EditText textNumber = (EditText) findViewById(R.id.textNumber);
                int number = Integer.parseInt(textNumber.getText().toString());
                Shape s = new Shape();
                if (s.triangularShape(number) && s.squareShape(number)) {
                    s.makeToast("Both Square Shape as well as Triangular Shape");
                } else if (s.squareShape(number)) {
                    s.makeToast("Square Shape");
                } else if (s.triangularShape(number)) {
                    s.makeToast("Triangular Shape");
                } else {
                    s.makeToast("Neither Square Shape nor Triangular Shape");
                }
            }catch (NumberFormatException ne){
                Toast.makeText(this, "Please Enter a number", Toast.LENGTH_SHORT).show();
            }

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
