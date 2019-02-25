package com.example.tvlist.network;

import com.example.tvlist.models.ResultSearch;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetDataService {
    @GET("/search/shows")
    Call<List<ResultSearch>> getShows(@Query("q") String param);
}
