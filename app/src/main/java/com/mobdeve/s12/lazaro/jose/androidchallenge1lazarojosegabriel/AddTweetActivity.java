package com.mobdeve.s12.lazaro.jose.androidchallenge1lazarojosegabriel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.app.Activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AddTweetActivity extends AppCompatActivity {
    // Views needed
    private Button cancelBtn, tweetBtn;
    private EditText tweetEt;
    private ImageView userImageIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Please note the layout for this activity is provided
        setContentView(R.layout.activity_add_tweet);

        // Instantiate the view variables. Please note the view IDs are aligned with the provided
        // activity_add_tweet.xml.
        this.cancelBtn = findViewById(R.id.cancelBtn);
        this.tweetBtn = findViewById(R.id.tweetBtn);
        this.tweetEt = findViewById(R.id.tweetEt);
        this.userImageIv = findViewById(R.id.userImageIv);

        // This line of code isn't needed if you hard coded the image into your layout
        this.userImageIv.setImageResource(R.drawable.myimage);

        this.cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Your logic for cancelling the tweet
            }
        });
        this.tweetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Your logic for sending a tweet
            }
        });
    }
}