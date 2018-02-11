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

    Button about,create,join,back_button;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltatsingup);

        about=(Button) findViewById(R.id.about_keppScore);
        create=(Button) findViewById(R.id.create);
        join=(Button) findViewById(R.id.join);
        back_button=(Button) findViewById(R.id.back_button);
        img=(ImageView) findViewById(R.id.bounceBallImage);

        TranslateAnimation mAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f,-300.0f);
        mAnimation.setDuration(500);
        mAnimation.setFillAfter(true);
        mAnimation.setRepeatCount(-200);
        mAnimation.setRepeatMode(Animation.REVERSE);
        img.setAnimation(mAnimation);

        about.setOnClickListener(new View.OnClickListener() {
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
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(LTATSingup.this,LTATLogin.class);
                startActivity(intent);
            }
        });
    }
    public void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }
}
