package com.example.gecisekrani;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
private TextView tv;
private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tv=findViewById(R.id.tv);
        iv=findViewById(R.id.iv);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.my_translation);
        tv.startAnimation(myanim);
        iv.startAnimation(myanim);
        final Intent i = new Intent(this,MainActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(4000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();

    }
}
