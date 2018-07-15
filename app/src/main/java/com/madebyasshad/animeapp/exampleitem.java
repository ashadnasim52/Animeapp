package com.madebyasshad.animeapp;

public class exampleitem {
    private String imageurl;
    private String mcreator;
    private int likes;


    public exampleitem(String imageurl, String mcreator, int likes) {
        this.imageurl = imageurl;
        this.mcreator = mcreator;
        this.likes = likes;
    }


    public String getImageurl() {
        return imageurl;
    }

    public String getMcreator() {
        return mcreator;
    }

    public int getLikes() {
        return likes;
    }
}
