package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.util.Log;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation.AnimationListener;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;
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
        b = (Button)findViewById(R.id.watch);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("tennisonline.ltat.com.ltattennisscore.MainActivity");
                startActivity(i);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(SplashActivity.this,LTATSingup.class);
                startActivity(in);
            }
        });



        ImageView bounceBallImage = (ImageView)findViewById(R.id.bounceBallImage);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.tennisball);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(),bitmap);
        roundedBitmapDrawable.setCircular(true);
        bounceBallImage.setImageDrawable(roundedBitmapDrawable);
        TranslateAnimation mAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f,-300.0f);
        //TranslateAnimation mAnimation = new TranslateAnimation(0,0,0,getDisplayHeight()/5);
        mAnimation.setDuration(500);
        mAnimation.setFillAfter(true);
        mAnimation.setRepeatCount(-200);
        mAnimation.setRepeatMode(Animation.REVERSE);
        bounceBallImage.setAnimation(mAnimation);


    }
    private int getDisplayHeight(){
        return this.getResources().getDisplayMetrics().heightPixels;
    }

}
