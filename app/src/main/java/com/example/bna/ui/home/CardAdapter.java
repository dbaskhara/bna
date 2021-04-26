package com.example.bna.ui.home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

import com.example.bna.R;
public class CardAdapter extends RecyclerView.Adapter<MyViewHolder> {
    List<CardData> listCardData = Collections.emptyList();
    Context context;
    AdapterView.OnItemClickListener click;
    public CardAdapter(List<CardData> listCardData, Context context) {
        this.listCardData = listCardData;
        this.context = context;
    }
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        MyViewHolder mvh = new MyViewHolder(v);
        return mvh;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myTextView1.setText(listCardData.get(position).getTitleMovie());
        holder.myTextView2.setText(listCardData.get(position).getSeason());
        holder.myTextView3.setText(listCardData.get(position).getEpisode());
        holder.myImageView.setImageResource(listCardData.get(position).getImage());
        holder.myTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent description = new Intent(v.getContext(),CardDescription.class);
                description.putExtra("title",listCardData.get(position).getTitleMovie());
                description.putExtra("season",listCardData.get(position).getSeason());
                description.putExtra("episode",listCardData.get(position).getEpisode());
                description.putExtra("description",listCardData.get(position).getDeskripsi());
                v.getContext().startActivity(description);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCardData.size();
    }
}
