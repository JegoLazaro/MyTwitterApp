package com.mobdeve.s12.lazaro.jose.androidchallenge1lazarojosegabriel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Tweet> dataTweet;
    private RecyclerView rvTweets;
    private TweetAdapter tweetAdapter;
    private RecyclerView.LayoutManager tweetManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initRecyclerView();
    }

    private void initRecyclerView(){
        this.dataTweet = new DataHelper().loadTweetData();

        this.rvTweets = findViewById(R.id.rvTweets);

        this.tweetManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        this.rvTweets.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        this.tweetAdapter = new TweetAdapter(this.dataTweet);
        this.rvTweets.setAdapter(this.tweetAdapter);
    }
}