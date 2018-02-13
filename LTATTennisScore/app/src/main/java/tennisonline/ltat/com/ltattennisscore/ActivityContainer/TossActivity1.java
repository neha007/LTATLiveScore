package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import tennisonline.ltat.com.ltattennisscore.R;

public class TossActivity1 extends AppCompatActivity {

    LinearLayout linearLayout1,linearLayout2;

    int teamA=0,teamB=0;
    int Ad ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toss1);


        linearLayout1 = (LinearLayout)findViewById(R.id.lt1);
        linearLayout2 = (LinearLayout)findViewById(R.id.lt2);


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
                    teamA = Ad;
                    displayteamA(teamA);
                }else if (teamA == Ad){
                    teamA  = 0;
                    displayteamA(teamA);
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
                     }else if (teamB == 40){
                    teamB  = Ad;
                    displayteamB(teamB);
                }else if (teamB == Ad){
                    teamB  = 0;
                    displayteamB(teamB);
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
