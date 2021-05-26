package com.example.jogiyo;
import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.MotionEvent;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

public class sampleshow extends AppCompatActivity{
    Button t1;

    static SoundPool sdPool;
    static int soundOfBomb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        LinearLayout mLay = new LinearLayout(this);
        mLay.setOrientation(LinearLayout.VERTICAL);

        sdPool = new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        soundOfBomb = sdPool.load(this,R.raw.bell,2);



        t1 = new Button(this);



        t1.setTextSize(130);
        t1.setText("이모님\n 주문받아주세요!");
        t1.setBackgroundColor(Color.WHITE);
        t1.setTextColor(Color.BLACK);

        mLay.addView(t1);

        t1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {

                    t1.setBackgroundColor(Color.BLACK);
                    t1.setTextColor(Color.WHITE);
                    sdPool.play(soundOfBomb,1.0F,1.0F,1,0,1.0F);
                }
                else{
                    t1.setBackgroundColor(Color.WHITE);
                    t1.setTextColor(Color.BLACK);
                }

                return false;
            }
        });

        setContentView(mLay);
    }


}
