package com.example.admin.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{
    public void PassData(int sum){
        FragmentManager fragmentManager =getSupportFragmentManager();
        FragmentTwo fragmentTwo =(FragmentTwo) fragmentManager.findFragmentById(R.id.frg2);
        if (fragmentTwo !=null){
            fragmentTwo.CatchData(sum);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv);


    }
}
