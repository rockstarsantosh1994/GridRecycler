package com.s.gridrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class SpeechAdapter extends RecyclerView.Adapter<SpeechAdapter.SpeechViewHolder> {
    ArrayList<SpeechData> speechDataArraylist;
    Context context;

    public SpeechAdapter(ArrayList<SpeechData> speechDataArraylist, Context context) {
        this.speechDataArraylist = speechDataArraylist;
        this.context = context;
    }

    @NonNull
    @Override
    public SpeechViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_speech_row,viewGroup,false);
        return new SpeechViewHolder(view);
    }

    //code tar work karat aht re arraylist madhe data jaat ahe display nhi hot ahe kahi

    @Override
    public void onBindViewHolder(@NonNull SpeechViewHolder speechViewHolder, int i) {
        speechViewHolder.tvTitle.setText(speechDataArraylist.get(i).getTitle());

        speechViewHolder.ivImage.setBackgroundDrawable(ContextCompat.getDrawable(context, speechDataArraylist.get(i).getImageSrc()) );

    }

    @Override
    public int getItemCount() {
        return speechDataArraylist.size();
    }

    public class SpeechViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle;
        ImageView ivImage;

        public SpeechViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle=itemView.findViewById(R.id.tvText);
            ivImage=itemView.findViewById(R.id.ivImage);
        }
    }
}