package com.example.fragmentexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Page1 extends Fragment {
    String data;
   Button btn ;
   TextView tx;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_page1, container, false);
        data=getArguments().getString("key");
        tx=v.findViewById(R.id.txtview);
        tx.setText(data);

        return v;
    }
}