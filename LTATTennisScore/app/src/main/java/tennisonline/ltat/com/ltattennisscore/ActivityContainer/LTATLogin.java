package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import tennisonline.ltat.com.ltattennisscore.R;

public class LTATLogin extends AppCompatActivity {

    EditText tournament_name,address,full_name,last_name;
    TextView header,player,administer_password;
    Button create_button;
    int srno;
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
        create_button=(Button) findViewById(R.id.creatematch_button);

        create_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 String first_check1=first_check.getText().toString();
                 String second_name1=second_check.getText().toString();
                 String tournament_name1=tournament_name.getText().toString();
                 String address1=address.getText().toString();
                 String full_name1=full_name.getText().toString();
                 String last_name1=last_name.getText().toString();
                 srno=0;

                  Person p1=new Person(srno,tournament_name1,address1,full_name1,last_name1);
                  DatabaseHelper databaseHelper=new DatabaseHelper(LTATLogin.this);

                   boolean b=databaseHelper.addPerson(p1);

                if(b==true)
                {
                    Intent intent=new Intent(LTATLogin.this,TossActivity.class);
                       startActivity(intent);
                    Toast.makeText(LTATLogin.this, "create succesfully", Toast.LENGTH_SHORT).show();
                }

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
