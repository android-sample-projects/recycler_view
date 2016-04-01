package com.example.robertpc.recyclerview.recyclerviews;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.robertpc.recyclerview.viewholder.MyViewHolder;

/**
 * Created by Robert PC on 4/1/2016.
 */
public class BaseRecyclerView extends RecyclerView.Adapter<MyViewHolder> {
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
