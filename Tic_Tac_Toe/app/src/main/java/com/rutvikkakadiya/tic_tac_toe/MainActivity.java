package com.rutvikkakadiya.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // 0 = x , 1 = o;

    int player = 0;

    boolean gameIsActive = true;

    int[] check = {2,2,2,2,2,2,2,2,2};

    int[][] winners = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

    public void move(View view) {

        ImageView counter = (ImageView) view;
        int tag = Integer.parseInt(counter.getTag().toString());
        if (check[tag] == 2 && gameIsActive) {
            check[tag] = player;

            if (player == 0) {

                counter.setImageResource(R.drawable.x);
                player = 1;

            } else {

                counter.setImageResource(R.drawable.o);
                player = 0;
            }

            counter.setTranslationY(-1000f);

            counter.animate().rotationY(3600f).translationYBy(1000f).setDuration(100);

            for(int[] winner : winners){

                
                if(check[winner[0]]==check[winner[1]]
                        && check[winner[1]]==check[winner[2]]
                        && check[winner[0]]!=2){

                    gameIsActive = false;
                   String win = "X";
                    if(check[winner[0]]== 1){
                        win = "O";
                    }
                    LinearLayout layout = (LinearLayout) findViewById(R.id.layout);

                    layout.setVisibility(View.VISIBLE);

                    TextView winnerDisplay = (TextView) findViewById(R.id.winnerDisplay);
                    winnerDisplay.setText(win + " has WON!");
                    break;
                }else{
                    boolean gameIsOver = true;
                    for(int checker : check){
                        if(checker == 2){
                            gameIsOver =  false;
                        }
                    }
                    if(gameIsOver){
                        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);

                        layout.setVisibility(View.VISIBLE);

                        TextView winnerDisplay = (TextView) findViewById(R.id.winnerDisplay);
                        winnerDisplay.setText("It's a Draw!");
                    }
                }
            }

        }
    }

    public void newGame (View view){

         player = 0;
        gameIsActive = true;

        for(int i=0;i<check.length;i++){
            check[i]=2;
        }

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);

        layout.setVisibility(View.INVISIBLE);

        GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLayout);

        for (int i =0;i<gridLayout.getChildCount();i++){

            ((ImageView) gridLayout.getChildAt(i)).setImageResource(0);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
