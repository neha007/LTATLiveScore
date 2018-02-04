package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;import android.widget.ImageView;
import android.widget.LinearLayout;
import android.util.Log;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation.AnimationListener;
import tennisonline.ltat.com.ltattennisscore.R;

public class SplashActivity extends AppCompatActivity {


    LinearLayout lt1;
    private static final String TAG = "AnimationStarter";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final ImageView bounceBallImage = (ImageView) findViewById(R.id.bounceBallImage);
        TranslateAnimation mAnimation = new TranslateAnimation(0f, 0f, 0f,50f);
        mAnimation.setDuration(500);
        mAnimation.setFillAfter(true);
        mAnimation.setRepeatCount(-2);
        mAnimation.setRepeatMode(Animation.REVERSE);
        bounceBallImage.setAnimation(mAnimation);


    }
}
