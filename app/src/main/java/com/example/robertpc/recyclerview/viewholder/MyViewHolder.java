package com.example.robertpc.recyclerview.viewholder;


import android.view.View;
import android.widget.TextView;

import com.example.robertpc.recyclerview.R;

/**
 * Created by Robert PC on 3/31/2016.
 */
public class MyViewHolder extends BaseViewHolder {

    public MyViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
        genre = (TextView) itemView.findViewById(R.id.genre);
        year = (TextView) itemView.findViewById(R.id.year);
    }

}
