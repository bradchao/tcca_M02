package com.example.administrator.tcca_m02;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private F1 f1;
    private F2 f2;
    private FragmentManager fmgr;
    private FragmentTransaction tran;
    private boolean isF1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = new F1(); f2 = new F2();
        fmgr = getFragmentManager();

        tran = fmgr.beginTransaction();
        tran.add(R.id.container, f1);
        tran.commit();
        isF1 = true;
    }

    public void test(View view){
        isF1 = !isF1;

        tran = fmgr.beginTransaction();
        tran.replace(R.id.container, isF1?f1:f2);
        //tran.addToBackStack(null);
        tran.commit();
    }
    public void test1(View view){
        Log.i("brad", "Main");
    }

}
