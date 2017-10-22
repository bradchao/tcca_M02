package com.example.administrator.tcca_m02;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private F1 f1;
    private F2 f2;
    private FragmentManager fmgr;
    private FragmentTransaction tran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = new F1(); f2 = new F2();
        fmgr = getFragmentManager();

        tran = fmgr.beginTransaction();
        tran.add(R.id.container, f1);
        tran.commit();

    }
}
