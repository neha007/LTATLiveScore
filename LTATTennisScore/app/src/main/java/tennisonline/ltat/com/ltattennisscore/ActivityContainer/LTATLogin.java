package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import tennisonline.ltat.com.ltattennisscore.R;

public class LTATLogin extends AppCompatActivity {

    EditText tournament_name,address,full_name,last_name;
    TextView header,player,administer_password;
    Button create_account;
    CheckBox first_check,second_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltatlogin);

        tournament_name=(EditText) findViewById(R.id.tournament_name);
        address=(EditText) findViewById(R.id.adress);
        full_name=(EditText) findViewById(R.id.full_name);
        last_name=(EditText) findViewById(R.id.last_name);

        first_check=(CheckBox) findViewById(R.id.first_check);
        second_check=(CheckBox) findViewById(R.id.second_check);

        header=(TextView) findViewById(R.id.header);
        player=(TextView) findViewById(R.id.player);
        administer_password=(TextView) findViewById(R.id.admister_password);

        create_account=(Button) findViewById(R.id.create_accound);

        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        }); 
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(LTATLogin.this,SplashActivity.class);
                startActivity(intent);
            }
        });

    }

}
