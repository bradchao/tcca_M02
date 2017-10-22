package com.example.administrator.tcca_m02;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class F1 extends Fragment {
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (view == null) {
            view =
                    inflater.inflate(R.layout.fragment_f1, container, false);
            Button test1 = (Button) view.findViewById(R.id.test1);
            test1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i("brad", "OK");
                }
            });
        }
        return view;
    }

}
