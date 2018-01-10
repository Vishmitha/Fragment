package com.example.admin.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;



public class FragmentOne extends Fragment {
    EditText editText1, editText2;
    Button button;
//ghtrfghbetgree
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        editText1 = (EditText) view.findViewById(R.id.edt1);
        editText2 = (EditText) view.findViewById(R.id.etd2);
        button = (Button) view.findViewById(R.id.but);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData(v);
            }
        });
        return view;
    }

   View sendData(View view){
       MainActivity mainActivity = (MainActivity) getActivity();
       mainActivity.PassData(Integer.parseInt(editText1.getText().toString()) + Integer.parseInt(editText2.getText().toString()));
       editText1.setText("");
       editText2.setText("");
        return  view;
    }
}