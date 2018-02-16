package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import tennisonline.ltat.com.ltattennisscore.R;

public class LTATSingup extends AppCompatActivity {

    Button aboutus_button,create_button,join_button,back_button;
    private int duration = 350;
    ImageView bounceBallImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltatsingup);

        aboutus_button=(Button) findViewById(R.id.aboutsinup_button);
        create_button=(Button) findViewById(R.id.create_button);
        join_button=(Button) findViewById(R.id.join_button);
        back_button=(Button) findViewById(R.id.back_button);
        bounceBallImage=(ImageView) findViewById(R.id.bounceBallImage);

        TranslateAnimation mAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f,-100.0f);
        mAnimation.setDuration(duration);
        mAnimation.setFillAfter(true);
        mAnimation.setRepeatCount(-200);
        mAnimation.setRepeatMode(Animation.REVERSE);
        bounceBallImage.setAnimation(mAnimation);

        aboutus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LTATSingup.this,AboutActivity.class);
                startActivity(i);

            }
        });
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(LTATSingup.this,SplashActivity.class);
                startActivity(intent);
            }
        });
        create_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(LTATSingup.this,LTATLogin.class);
                startActivity(intent);
            }
        });
        join_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LTATSingup.this,Filters.class);
                startActivity(intent);
            }
        });
    }
}
