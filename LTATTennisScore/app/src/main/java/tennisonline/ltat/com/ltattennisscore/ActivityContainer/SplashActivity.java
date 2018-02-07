package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.view.animation.TranslateAnimation;

import tennisonline.ltat.com.ltattennisscore.R;
import tennisonline.ltat.com.ltattennisscore.fragmentcontainer.About;

public class SplashActivity extends AppCompatActivity {

    Button watch_score,keep_score,back_button;
    private static final String TAG = "AnimationStarter";
    Button about ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        about = (Button) findViewById(R.id.warning);
        watch_score=(Button) findViewById(R.id.watch_score);
        keep_score=(Button) findViewById(R.id.keep_score);


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //loadFragment(new About());
                Intent i = new Intent(SplashActivity.this,AboutActivity.class);
                startActivity(i);
            }
        });

        watch_score=(Button) findViewById(R.id.watch_score);
        keep_score=(Button) findViewById(R.id.keep_score);

        watch_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SplashActivity.this,TossActivity.class);
                startActivity(i);
            }
        });
        keep_score.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent in=new Intent(SplashActivity.this,LTATSingup.class);
                startActivity(in);
            }
        });

        ImageView bounceBallImage = (ImageView)findViewById(R.id.bounceBallImage);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.tennnn1);

        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(),bitmap);
        roundedBitmapDrawable.setCircular(true);
        bounceBallImage.setImageDrawable(roundedBitmapDrawable);
        TranslateAnimation mAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f,-300.0f);
        mAnimation.setDuration(500);
        mAnimation.setFillAfter(true);
        mAnimation.setRepeatCount(-200);
        mAnimation.setRepeatMode(Animation.REVERSE);
        bounceBallImage.setAnimation(mAnimation);

        }

    public void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }

    }
