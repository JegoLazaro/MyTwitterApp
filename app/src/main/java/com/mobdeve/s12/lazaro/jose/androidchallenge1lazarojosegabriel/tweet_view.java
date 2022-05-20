package com.mobdeve.s12.lazaro.jose.androidchallenge1lazarojosegabriel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class tweet_view extends AppCompatActivity {

    private TextView tvDisplayName;
    private ImageView ivImageId;
    private TextView tvUserHandle;
    private TextView tvCaption;
    private TextView tvCreatedAt;
    private TextView tvLikes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet_view);

        this.tvDisplayName = findViewById(R.id.tv_displayName);
        this.ivImageId = findViewById(R.id.iv_imageId);
        this.tvUserHandle = findViewById(R.id.tv_userHandle);
        this.tvCaption = findViewById(R.id.tv_caption);
        this.tvCreatedAt = findViewById(R.id.tv_createdAt);
        this.tvLikes = findViewById(R.id.tv_likes);

        Intent i = getIntent();
        int iPicture = i.getIntExtra(TweetAdapter.KEY_PICTURE, 0);
        this.ivImageId.setImageResource(iPicture);

        this.tvDisplayName.setText(i.getStringExtra(TweetAdapter.KEY_NAME));
        this.tvUserHandle.setText(i.getStringExtra(TweetAdapter.KEY_USERHANDLE));
        this.tvCaption.setText(i.getStringExtra(TweetAdapter.KEY_TWEET));
        this.tvCreatedAt.setText(i.getStringExtra(TweetAdapter.KEY_CREATED_AT));
        //this.tvLikes.setText(i.getStringExtra(TweetAdapter.KEY_LIKES));
    }
}