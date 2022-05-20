package com.mobdeve.s12.lazaro.jose.androidchallenge1lazarojosegabriel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class TweetAdapter extends RecyclerView.Adapter<TweetViewHolder> {

    private ArrayList<Tweet> dataTweet;

    public static final String KEY_NAME = "KEY_NAME";
    public static final String KEY_TWEET = "KEY_TWEET";
    public static final String KEY_PICTURE = "KEY_PICTURE";
    public static final String KEY_USERHANDLE = "KEY_USERHANDLE";
    public static final String KEY_CREATED_AT = "KEY_CREATED_AT";

    public TweetAdapter (ArrayList<Tweet> dataTweet) {
        this.dataTweet = dataTweet;
    }

    @NonNull
    @NotNull
    @Override
    public TweetViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_post, parent, false);

        TweetViewHolder tweetViewHolder = new TweetViewHolder(itemView);


        return tweetViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull TweetViewHolder holder, int position) {
        Tweet currentTweet = this.dataTweet.get(position);

        holder.setImageId(currentTweet.getImageId());
        holder.setDisplayName(currentTweet.getDisplayName());
        holder.setUserHandle(currentTweet.getUserHandle());
        holder.setCaption(currentTweet.getCaption());

    }

    @Override
    public int getItemCount() {
        return this.dataTweet.size();
    }
}
