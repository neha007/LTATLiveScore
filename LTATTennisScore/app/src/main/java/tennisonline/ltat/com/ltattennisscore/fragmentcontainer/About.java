package tennisonline.ltat.com.ltattennisscore.fragmentcontainer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import tennisonline.ltat.com.ltattennisscore.R;

public class About extends Fragment {

    Button b;


    public About() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about,container,false);
        b = (Button) view.findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"chhh",Toast.LENGTH_LONG).show();
                //Intent i = new Intent("tennisonline.ltat.com.ltattennisscore.SplashActivity");
                //startActivity(i);
            }
        });
        onBackPressed();

        //Intent i = new Intent("tennisonline.ltat.com.ltattennisscore.SplashActivity");
        //startActivity(i);
       // return inflater.inflate(R.layout.fragment_about, container, false);
        return view;
    }
    public void onBackPressed(){
        FragmentManager fm = getActivity().getSupportFragmentManager();
        fm.popBackStack();
    }

}
