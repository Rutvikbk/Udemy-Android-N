package com.rutvikkakadiya.sounddemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mplayer;

    public void playSound(View view){

        mplayer.start();
    }
    public void onPause (View view) {

            mplayer.pause();
    }
    public void stop (View view) {

        mplayer.stop();
        mplayer = MediaPlayer.create(this, R.raw.laugh);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mplayer = MediaPlayer.create(this, R.raw.laugh);
    }
}
