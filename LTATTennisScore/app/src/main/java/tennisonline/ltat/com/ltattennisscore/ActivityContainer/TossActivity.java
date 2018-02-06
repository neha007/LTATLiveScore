package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import tennisonline.ltat.com.ltattennisscore.R;

public class TossActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toss);
        radioGroup = (RadioGroup)findViewById(R.id.radiogroup);
        r1 = (RadioButton)findViewById(R.id.r1);
        r2 = (RadioButton)findViewById(R.id.r2);

    }
    public void onRadioButton(View view){
        boolean checked = ((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.r1:
                if (checked){
                    Toast.makeText(getApplicationContext(),"r1",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.r2:
                if (checked){
                    Toast.makeText(getApplicationContext(),"r2",Toast.LENGTH_LONG).show();
                }
                break;
        }

    }
}
