package com.example.dell.chalchitra2;

import android.content.Context;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Callback;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private List<movie> movie;
    private int rowLayout;
    private Context context;
    private static final String IMAGE_URL_BASE_PATH = "http://image.tmdb.org/t/p/w342/";

    public MovieAdapter(List<movie> movies, int rowLayout, Context context) {
        this.movie = movies;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        LinearLayout movieslayout;
        TextView movietitle;
        TextView moviedescription;
        TextView date;
        TextView rating;
        ImageView movieimage;

        public MovieViewHolder(View itemView) {
            super(itemView);
            movieslayout = itemView.findViewById(R.id.movies_layout);
            movietitle = (TextView) itemView.findViewById(R.id.movie_title);
            moviedescription = (TextView) itemView.findViewById(R.id.movie_description);
            date = (TextView) itemView.findViewById(R.id.movie_date);
            rating = (TextView) itemView.findViewById(R.id.movie_rating);
            movieimage = (ImageView) itemView.findViewById(R.id.movie_image);
        }
    }

    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        String image_url = IMAGE_URL_BASE_PATH + movie.get(position).getPoster_path();
        Picasso.with(context)
                .load(image_url)
                .placeholder(android.R.drawable.sym_def_app_icon)
                .error(android.R.drawable.sym_def_app_icon)
                .into(holder.movieimage);
        //Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").into(holder.movieimage);

        holder.movietitle.setText(movie.get(position).getTitle());
        holder.date.setText(movie.get(position).getRelease_date());
        holder.moviedescription.setText(movie.get(position).getOverview());
    }

    @Override
    public int getItemCount() {
        return movie.size();
    }
}
