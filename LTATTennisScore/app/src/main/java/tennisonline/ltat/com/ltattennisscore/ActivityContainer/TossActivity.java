package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.content.Intent;
import android.graphics.Point;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import tennisonline.ltat.com.ltattennisscore.R;

  public class TossActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton r1,r2;
    ImageView imageView;
    Button btn_continu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toss);
        radioGroup = (RadioGroup)findViewById(R.id.radiogroup);
        r1 = (RadioButton)findViewById(R.id.r1);
        r2 = (RadioButton)findViewById(R.id.r2);
        imageView=(ImageView) findViewById(R.id.img);
        btn_continu=(Button) findViewById(R.id.btn_contue);
        btn_continu.setVisibility(View.INVISIBLE);
        
                r1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Animation img = new TranslateAnimation(Animation.ABSOLUTE, -265, Animation.ABSOLUTE, Animation.ABSOLUTE);
                        img.setDuration(500);
                        img.setFillAfter(true);
                        imageView.startAnimation(img);
                        btn_continu.setVisibility(View.VISIBLE);

                    }

                });

                r2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Animation img = new TranslateAnimation(Animation.ABSOLUTE, 250, Animation.ABSOLUTE, Animation.ABSOLUTE);
                        //img.setDuration(1000);
                        img.setDuration(500);
                        img.setFillAfter(true);
                        imageView.startAnimation(img);
                        btn_continu.setVisibility(View.VISIBLE);

                    }
                });


                btn_continu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(TossActivity.this, TossActivity1.class);
                        startActivity(intent);
                    }
                });
            }
    }



