package com.s.gridrecyclerview;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import java.util.ArrayList;

public  class HelloFragment extends Fragment {

    RecyclerView rvLoadDashBoard;
    View view;
    Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_speech_fragment1, container, false);

        //basici intialisation..
        initViews();

        rvLoadDashBoard=view.findViewById(R.id.rv_load_dashboard);

        rvLoadDashBoard.setLayoutManager(new GridLayoutManager(getContext(),3));

        ArrayList<SpeechData> speechDataArrayList=new ArrayList<>();
        speechDataArrayList.add(new SpeechData(R.drawable.ic_book,"BrAmbedkar"));
        speechDataArrayList.add(new SpeechData(R.drawable.ic_book,"BrAmbedkar"));
        speechDataArrayList.add(new SpeechData(R.drawable.ic_book,"BrAmbedkar"));
        speechDataArrayList.add(new SpeechData(R.drawable.ic_book,"BrAmbedkar"));
        speechDataArrayList.add(new SpeechData(R.drawable.ic_book,"BrAmbedkar"));
        speechDataArrayList.add(new SpeechData(R.drawable.ic_book,"BrAmbedkar"));
        speechDataArrayList.add(new SpeechData(R.drawable.ic_book,"BrAmbedkar"));

        SpeechAdapter speechAdapter = new SpeechAdapter(speechDataArrayList,getContext());
        rvLoadDashBoard.setAdapter(speechAdapter);

        return view;
    }

    //ya fragment la call kar ani run kar application.

    private void initViews(){
        btn=view.findViewById(R.id.btn_submit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    Toast.makeText(getContext(), "Ckicked", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}



