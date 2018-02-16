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
    RadioButton radiobutton1,radiobutton2;
    ImageView imageView;
    private int duration = 500;
    Button continue_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toss);
        radioGroup = (RadioGroup)findViewById(R.id.radiogroup);
        radiobutton1 = (RadioButton)findViewById(R.id.radiobutton1);
        radiobutton2 = (RadioButton)findViewById(R.id.radiobutton2);
        imageView=(ImageView) findViewById(R.id.img);
        continue_button=(Button) findViewById(R.id.continue_button);
        continue_button.setVisibility(View.INVISIBLE);

        radiobutton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Animation img = new TranslateAnimation(Animation.ABSOLUTE, -265, Animation.ABSOLUTE, Animation.ABSOLUTE);
                        img.setDuration(duration);
                        img.setFillAfter(true);
                        imageView.startAnimation(img);
                        continue_button.setVisibility(View.VISIBLE);

                    }

                });

        radiobutton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Animation img = new TranslateAnimation(Animation.ABSOLUTE, 250, Animation.ABSOLUTE, Animation.ABSOLUTE);
                        img.setDuration(duration);
                        img.setFillAfter(true);
                        imageView.startAnimation(img);
                        continue_button.setVisibility(View.VISIBLE);

                    }
                });


        continue_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(TossActivity.this, TossActivity1.class);
                        startActivity(intent);
                    }
                });
            }
    }



