package com.example.bna.ui.home;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.bna.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView myTextView1 , myTextView2 , myTextView3;
    ImageView myImageView;
    MyViewHolder(View itemView){
        super(itemView);
        myTextView1 = itemView.findViewById(R.id.titleMovie);
        myTextView2 = itemView.findViewById(R.id.season);
        myTextView3 = itemView.findViewById(R.id.episode);
        myImageView = itemView.findViewById(R.id.ilustration);
    }
}
