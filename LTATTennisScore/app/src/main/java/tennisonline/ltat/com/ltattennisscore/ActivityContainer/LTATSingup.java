package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import tennisonline.ltat.com.ltattennisscore.R;

public class LTATSingup extends AppCompatActivity {

    Button about,create,join,back_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltatsingup);

       about=(Button) findViewById(R.id.about_keppScore);
        create=(Button) findViewById(R.id.create);
        join=(Button) findViewById(R.id.join);
        back_button=(Button) findViewById(R.id.back_button);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(LTATSingup.this, "this is about pages", Toast.LENGTH_SHORT).show();

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
}
