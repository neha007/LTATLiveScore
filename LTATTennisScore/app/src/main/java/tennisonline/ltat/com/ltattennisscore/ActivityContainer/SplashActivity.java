package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;
import tennisonline.ltat.com.ltattennisscore.R;

public class SplashActivity extends AppCompatActivity {

    Button watchscore_button,keepscore_button;
    private static final String TAG = "AnimationStarter";
    private int duration = 400;
    Button about_button ;
<<<<<<< HEAD
    TextView text1,text2;
    ImageView bounceBallImage;
    GifImageView giff11;
=======
    ImageView bounceBallImage;
>>>>>>> change in splashactivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        about_button = (Button) findViewById(R.id.aboutus);
        watchscore_button=(Button) findViewById(R.id.watchscore_button);
        keepscore_button=(Button) findViewById(R.id.keepscore_button);

        text1=(TextView) findViewById(R.id.text1);
        text2=(TextView) findViewById(R.id.text2);
        giff11=(GifImageView) findViewById(R.id.gif11);


        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //loadFragment(new About());
                Intent i = new Intent(SplashActivity.this,AboutActivity.class);
                startActivity(i);
            }
        });



        watchscore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SplashActivity.this,Gifsplash.class);
                startActivity(i);
            }
        });
        keepscore_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent in=new Intent(SplashActivity.this,LTATSingup.class);
                startActivity(in);
            }
        });
<<<<<<< HEAD
         bounceBallImage = (ImageView)findViewById(R.id.bounceBallImage);
=======
        bounceBallImage = (ImageView)findViewById(R.id.bounceBallImage);
>>>>>>> change in splashactivity
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.tennnn1);

        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(),bitmap);
        roundedBitmapDrawable.setCircular(true);
        bounceBallImage.setImageDrawable(roundedBitmapDrawable);
        TranslateAnimation mAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f,-110.0f);
        mAnimation.setDuration(duration);
        mAnimation.setFillAfter(true);
        mAnimation.setRepeatCount(-200);
        mAnimation.setRepeatMode(Animation.REVERSE);
        bounceBallImage.setAnimation(mAnimation);

        }
    }
