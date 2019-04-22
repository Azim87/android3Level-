package com.kubatov.lastfmapp.model;

import android.support.annotation.NonNull;

public class TrackEntity  {
    private int id;
    private String name;
    private String artist;
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;

    }

    @NonNull
    @Override
    public String toString() {
        return id + " " + name + " " + artist + " " + image;
    }
}
