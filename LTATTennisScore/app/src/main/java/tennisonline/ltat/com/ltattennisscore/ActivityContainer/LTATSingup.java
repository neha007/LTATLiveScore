package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import tennisonline.ltat.com.ltattennisscore.R;

public class LTATSingup extends AppCompatActivity {

    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltatsingup);
       bt1=(Button) findViewById(R.id.bt1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(LTATSingup.this, "this is harshit", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
