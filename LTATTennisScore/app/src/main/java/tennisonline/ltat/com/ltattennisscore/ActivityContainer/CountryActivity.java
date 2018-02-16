package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import tennisonline.ltat.com.ltattennisscore.R;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        String list[] = {"India","Russia","America","China","Japan","Bhutan"};
        ListView listView = (ListView)findViewById(R.id.country);
        ArrayAdapter<String>ad = new ArrayAdapter<String>(this,R.layout.listview,R.id.country1,list);
        listView.setAdapter(ad);
    }
}
