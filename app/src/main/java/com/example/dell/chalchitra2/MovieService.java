package com.example.dell.chalchitra2;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Dell on 12/17/2017.
 */

public interface MovieService {
    @GET("movie/popular")
    Call<MovieResponse> getpopularmovies(@Query("api_key") String apikey);
}
