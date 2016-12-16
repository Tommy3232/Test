package com.artem.test_for_work.adapter;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;

import com.artem.test_for_work.R;
import com.artem.test_for_work.dto.TestDTO;

import java.util.List;

public class MuzikaListAdapter extends RecyclerView.Adapter<MuzikaListAdapter.MuzikaViewHolder> {

    private List<TestDTO> data;
    public MuzikaListAdapter(List<TestDTO> data){
        this.data=data;
    }


    @Override
    public MuzikaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new MuzikaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MuzikaViewHolder holder, int position) {
        TestDTO item =data.get(position);
        holder.title.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MuzikaViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView title;


    public MuzikaViewHolder(View itemView) {
        super(itemView);

        cardView=(CardView) itemView.findViewById(R.id.cardView);
        title= (TextView) itemView.findViewById(R.id.title);
    }
}
}
