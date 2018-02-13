package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import tennisonline.ltat.com.ltattennisscore.R;

public class TossActivity1 extends AppCompatActivity {

    LinearLayout linearLayout1,linearLayout2;
    EditText e1,e2,e3,e6,e7,e8;

    int teamA=0,teamB=0;
    int Ad ;
    int B=0,C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toss1);

        linearLayout1 = (LinearLayout)findViewById(R.id.lt1);
        linearLayout2 = (LinearLayout)findViewById(R.id.lt2);

        e1=(EditText) findViewById(R.id.p1);
        e2=(EditText) findViewById(R.id.p2);
        e3=(EditText) findViewById(R.id.p3);
        e6=(EditText) findViewById(R.id.p6);
        e7=(EditText) findViewById(R.id.p7);
        e8=(EditText) findViewById(R.id.p8);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (teamA <30){
                    teamA  = teamA + 15;
                    displayteamA(teamA);
                }else if (teamA==30){
                    teamA  = teamA + 10;
                    displayteamA(teamA);

                }else if (teamA == 40){
                   teamA =0;
                    displayteamA(teamA);

                    if(B<=5)
                    {
                        B=B+1;
                        e1.setText(""+B);
                    }
                    if(B>=6 && C<=5)
                    {
                        C=C+1;
                        e2.setText(""+C);
                    }
                }
            }

        });

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (teamB <30){
                    teamB  = teamB + 15;
                    displayteamB(teamB);

                }else if (teamB == 30){
                    teamB  = teamB + 10;
                    displayteamB(teamB);
                     }else if (teamB == 40)
                 {
                    teamA =0;
                    displayteamA(teamA);

                    if(B<=5)
                    {
                        B=B+1;
                        e1.setText(""+B);
                    }
                    if(B>=6 && C<=5)
                    {
                        C=C+1;
                        e2.setText(""+C);
                    }

                }
            }
        });

    }

    private void displayteamA(int score){
        TextView left = (TextView)findViewById(R.id.textleft);
        left.setText(""+score);
    }

    private void displayteamB(int score){

        TextView right = (TextView)findViewById(R.id.textright);
        right.setText(""+score);
    }

}
