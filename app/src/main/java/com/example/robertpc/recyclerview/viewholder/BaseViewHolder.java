package com.example.robertpc.recyclerview.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Robert PC on 4/1/2016.
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    public TextView title, year, genre;

    public BaseViewHolder(View itemView) {
        super(itemView);
    }
}
