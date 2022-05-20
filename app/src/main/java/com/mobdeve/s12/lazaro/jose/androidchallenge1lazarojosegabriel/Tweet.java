package com.mobdeve.s12.lazaro.jose.androidchallenge1lazarojosegabriel;

// Specify your package here

public class Tweet {
    private String userHandle, displayName, caption;
    private int likes, imageId;
    private CustomDate createdAt;

    // Creates a Tweet providing all information. This used in the DataHelper class.
    public Tweet(String userHandle, String displayName, String caption, int likes, int imageId, CustomDate createdAt) {
        this.userHandle = userHandle;
        this.displayName = displayName;
        this.caption = caption;
        this.likes = likes;
        this.imageId = imageId;
        this.createdAt = createdAt;
    }

    // Creates a tweet with limited information. Here, the likes, image, and date are
    // initialized. This is meant for when the user creates a tweet. You can even modify
    // this constructor to accept only a caption and have the userHandle and displayName
    // initialized inside since they won't change for our problem.
    public Tweet(String userHandle, String displayName, String caption) {
        this.userHandle = userHandle;
        this.displayName = displayName;
        this.caption = caption;
        this.likes = 0;
        // Please make sure to supply your own image.
        this.imageId = R.drawable.myimage;
        // This creates a CustomDate object using the current date.
        this.createdAt = new CustomDate();
    }

    public String getUserHandle() {
        return userHandle;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getCaption() {
        return caption;
    }

    public int getLikes() {
        return likes;
    }

    public int getImageId() {
        return imageId;
    }

    public CustomDate getCreatedAt() {
        return createdAt;
    }
}

