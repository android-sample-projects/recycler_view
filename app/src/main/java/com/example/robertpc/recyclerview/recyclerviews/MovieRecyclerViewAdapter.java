package com.example.robertpc.recyclerview.recyclerviews;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.robertpc.recyclerview.DetailActivity;
import com.example.robertpc.recyclerview.R;
import com.example.robertpc.recyclerview.models.Movie;
import com.example.robertpc.recyclerview.viewholder.MyViewHolder;

import java.util.List;

/**
 * Created by Robert PC on 3/31/2016.
 */
public class MovieRecyclerViewAdapter extends BaseRecyclerView {
    private List<Movie> moviesList;

    public MovieRecyclerViewAdapter(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Movie movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentItem = new Intent(v.getContext(), DetailActivity.class);
                intentItem.putExtra("title", movie.getTitle());
                v.getContext().startActivity(intentItem);
            }
        });
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
