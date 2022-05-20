package com.mobdeve.s12.lazaro.jose.androidchallenge1lazarojosegabriel;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TweetViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivImageId;
    private FloatingActionButton fabAdd;
    private TextView tvdisplayName, tvCaption, tvUserHandle, tvCreatedAt, tvLikes;

    public TweetViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
        super(itemView);

        this.ivImageId = itemView.findViewById(R.id.iv_imageId);
        this.tvCaption = itemView.findViewById(R.id.tv_caption);
        this.tvdisplayName = itemView.findViewById(R.id.tv_displayName);
//      this.tvCreatedAt = itemView.findViewById(R.id.tv_createdAt);
//      this.tvLikes = itemView.findViewById(R.id.tv_likes);
        this.tvUserHandle = itemView.findViewById(R.id.tv_userHandle);
    }
    public void setImageId(int imageId){
        this.ivImageId.setImageResource(imageId);
    }
    public void setDisplayName(String name){
        this.tvdisplayName.setText(name);
    }
    public void setCaption(String caption){
        this.tvCaption.setText(caption);
    }
    public void setUserHandle(String userHandle){
        this.tvUserHandle.setText(userHandle);
    }
    public void setCreatedAt(String createdAt){
        this.tvCreatedAt.setText(createdAt);
    }
    public void setLikes(int likes){
        this.tvLikes.setText(likes);
    }
    public ImageView getIbPicture() {
        return this.ivImageId;
    }
}

