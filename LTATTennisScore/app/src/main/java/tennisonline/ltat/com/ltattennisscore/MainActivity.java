package tennisonline.ltat.com.ltattennisscore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import tennisonline.ltat.com.ltattennisscore.ActivityContainer.SplashActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1=(Button) findViewById(R.id.bt1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this, SplashActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"check",Toast.LENGTH_LONG).show();
            }
        });
    }

}
