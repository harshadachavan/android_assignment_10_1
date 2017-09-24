package com.example.harshadachavan.simpleaddition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragmenttop.FragmenttopListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonClick(String text) {

        Fragmentbottom newFragment = new Fragmentbottom();
        //Fragmentbottom textFragment = (Fragmentbottom)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        newFragment.changeTextProperties(text);
    }
}
