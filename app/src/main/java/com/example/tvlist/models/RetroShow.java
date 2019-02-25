package com.example.tvlist.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class RetroShow {

    @SerializedName("genres")
    private List<String> genres;
    @SerializedName("title")
    private String title;
    @SerializedName("image")
    private Map<String, String> image;
    @SerializedName("summary")
    private String summary;
    @SerializedName("premiered")
    private String premiered;

    public RetroShow() {
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genres.get(0);
    }

    public String getPosterUrl() {
        return image.get("medium");
    }
}
