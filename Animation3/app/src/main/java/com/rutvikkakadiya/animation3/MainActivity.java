package com.rutvikkakadiya.animation3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void animate(View view){
        ImageView bart = (ImageView) findViewById(R.id.bart);

        bart.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .scaleX(0.75f)
                .scaleY(0.75f)
                .rotationX(1440f)
                .rotationY(1440f)
                .rotationBy(1440f)
                .setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bart = (ImageView) findViewById(R.id.bart);

        bart.setTranslationX(-1000f);
        bart.setTranslationY(-1000f);
    }
}
