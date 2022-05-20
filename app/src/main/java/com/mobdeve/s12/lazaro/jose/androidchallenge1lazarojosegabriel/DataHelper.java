package com.mobdeve.s12.lazaro.jose.androidchallenge1lazarojosegabriel;

// Specify your package here

import java.util.ArrayList;

/*
 * To load the data, simply declare an ArrayList<Tweet> variable and assign, as such:
 *       private ArrayList<Tweet> data;
 *       .
 *       .
 *       .
 *       this.data = DataHelper.loadTweetData();
 * However, you don't have to follow this and can implement this with what you feel
 * comfortable with.
 * */

public class DataHelper {
    public static ArrayList<Tweet> loadTweetData() {
        ArrayList<Tweet> data = new ArrayList<Tweet>();

        data.add(new Tweet(
                "armin.armode.armedian", "Armin Arlert",
                "RT: Some people consider me a... #bomb",
                9999, R.drawable.armin, new CustomDate(2021, 0,10)));
        data.add(new Tweet(
                "wonderboy", "Zeke Jaeger",
                "HUUUUUUH????",
                1, R.drawable.zeke, new CustomDate(2021, 0,10)));
        data.add(new Tweet(
                "eldian.pride", "Falco Grice",
                "I'm so screwed...",
                13, R.drawable.falco, new CustomDate(2021, 0,10)));
        data.add(new Tweet(
                "rudolph_the_reiner", "Reiner Braun",
                "@jaegermeister awit",
                0, R.drawable.reiner, new CustomDate(2021, 0,10)));
        data.add(new Tweet(
                "jaegermeister", "Eren Jaeger",
                "@rudolph_the_reiner you're just like me, bro",
                454, R.drawable.eren, new CustomDate(2021, 0,10)));
        data.add(new Tweet(
                "eren_simp", "Mikasa Ackerman",
                "Finally get to see Eren!! <3",
                10203, R.drawable.mikasa, new CustomDate(2021, 0,10)));
        data.add(new Tweet(
                "levi", "Levi Ackerman",
                "So dirty here...",
                13, R.drawable.levi, new CustomDate(2021, 0,7)));
        data.add(new Tweet(
                "rudolph_the_reiner", "Reiner Braun",
                "Too much on my mind... #Stressed",
                1, R.drawable.reiner, new CustomDate(2021, 0,8)));
        data.add(new Tweet(
                "eldian.pride", "Falco Grice",
                "SUCK IT, GABI! I won this time!!\n\n***notice me plz*** -.-",
                4, R.drawable.falco, new CustomDate(2021, 0,6)));
        data.add(new Tweet(
                "rudolph_the_reiner", "Reiner Braun",
                "Official broke after the festival :((",
                4, R.drawable.reiner, new CustomDate(2021, 0,4)));
        data.add(new Tweet(
                "eldian.pride", "Falco Grice",
                "Met a nice guy at the nearby hospital!",
                3, R.drawable.falco, new CustomDate(2021, 0,4)));
        data.add(new Tweet(
                "jaegermeister", "Eren Jaeger",
                "Just checked in @ Liberio",
                253, R.drawable.eren, new CustomDate(2021, 0,3)));
        data.add(new Tweet(
                "wonderboy", "Zeke Jaeger",
                "Oh! That's a baseball!",
                3, R.drawable.zeke, new CustomDate(2021, 0,2)));
        data.add(new Tweet(
                "eren_simp", "Mikasa Ackerman",
                "When will Eren notice me?",
                54931, R.drawable.mikasa, new CustomDate(2020, 11,31)));
        data.add(new Tweet(
                "jaegermeister", "Eren Jaeger",
                "Happy New Year, Marley #soon",
                23, R.drawable.eren, new CustomDate(2020, 11,31)));
        data.add(new Tweet(
                "levi", "Levi Ackerman",
                "Need new jeans",
                3423, R.drawable.levi, new CustomDate(2020, 10,16)));
        data.add(new Tweet(
                "armin.armode.armedian", "Armin Arlert",
                "Some people consider me a... #bomb",
                111, R.drawable.armin, new CustomDate(2020, 9,29)));
        data.add(new Tweet(
                "eren_simp", "Mikasa Ackerman",
                "@RandomFan I'm not from Haikyuu",
                68473, R.drawable.mikasa, new CustomDate(2020, 7,5)));
        data.add(new Tweet(
                "armin.armode.armedian", "Armin Arlert",
                "Heading to the beach today!",
                393, R.drawable.armin, new CustomDate(2020, 5,24)));
        data.add(new Tweet(
                "dotpunchman", "Dot Pixis",
                "Just wanted to make a OPM reference",
                1, R.drawable.dot, new CustomDate(2005, 4,5)));
        return data;
    }
}

