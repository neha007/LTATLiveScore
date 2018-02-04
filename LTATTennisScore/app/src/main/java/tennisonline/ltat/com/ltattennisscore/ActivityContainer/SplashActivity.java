package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.util.Log;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation.AnimationListener;
import android.widget.Toast;

import tennisonline.ltat.com.ltattennisscore.R;

public class SplashActivity extends AppCompatActivity {


    LinearLayout lt1;
    Button b;
    Button bt2;
    private static final String TAG = "AnimationStarter";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
         bt2=(Button) findViewById(R.id.bt2);
        Toast.makeText(this, "this is harshit", Toast.LENGTH_SHORT).show();

        b = (Button)findViewById(R.id.watch);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("tennisonline.ltat.com.ltattennisscore.MainActivity");
                startActivity(i);
            }
        });

        final ImageView bounceBallImage = (ImageView) findViewById(R.id.bounceBallImage);
        TranslateAnimation mAnimation = new TranslateAnimation(0f, 0f, 0f,50f);
        mAnimation.setDuration(500);
        mAnimation.setFillAfter(true);
        mAnimation.setRepeatCount(-2);
        mAnimation.setRepeatMode(Animation.REVERSE);
        bounceBallImage.setAnimation(mAnimation);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(SplashActivity.this,LTATSingup.class);
                startActivity(in);
            }
        });


    }
}
