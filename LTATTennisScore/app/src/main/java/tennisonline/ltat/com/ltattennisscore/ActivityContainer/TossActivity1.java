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

    int teamA=0,teamB=0;
    int A=0,B=0,C=0,D=0,E=0,F=0,G=0,I=0,J=0,K=0;
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toss1);

        e1 = (EditText)findViewById(R.id.p1);
        e2 = (EditText)findViewById(R.id.p2);
        e3 = (EditText)findViewById(R.id.p3);
        e4 = (EditText)findViewById(R.id.p4);
        e5 = (EditText)findViewById(R.id.p5);
        e6 = (EditText)findViewById(R.id.p6);
        e7 = (EditText)findViewById(R.id.p7);
        e8 = (EditText)findViewById(R.id.p8);
        e9 = (EditText)findViewById(R.id.p9);
        e10 = (EditText)findViewById(R.id.p10);

        linearLayout1 = (LinearLayout)findViewById(R.id.linearlayout1);
        linearLayout2 = (LinearLayout)findViewById(R.id.linearlayout2);



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


                    if (F<=5){
                        F = F+1;
                        e1.setText(""+F);
                    }
                    if (F>=6&& G<=5){

                        G = G+1;
                        e2.setText(""+G);
                    }
                    if (G>=6 && I<=5){
                        I = I+1;
                        e3.setText(""+I);
                    }
                    if (I>=6 && J<=5){
                        J = J+1;
                        e4.setText(""+J);
                    }
                    if (J>=6 && K<=5){
                        K = K+1;
                        e5.setText(""+K);
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
                     }

                     else if (teamB == 40){
                    teamB  = 0;
                    displayteamB(teamB);

                        if (B<=5){
                            B = B+1;
                            e6.setText(""+B);
                        }
                        if (B>=6&& A<=5){
                            A = A+1;
                            e7.setText(""+A);
                        }
                        if (A>=6 && C<=5){
                            C = C+1;
                            e8.setText(""+C);
                        }
                        if (C>=6 && D<=5){
                            D = D+1;
                            e9.setText(""+D);
                        }
                        if (D>=6 && E<=5){
                            E = E+1;
                            e10.setText(""+E);
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



