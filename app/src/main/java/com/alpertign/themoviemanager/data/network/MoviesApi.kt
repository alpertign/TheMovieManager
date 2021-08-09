package com.alpertign.themoviemanager.data.network


import com.alpertign.themoviemanager.model.Movies
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap


interface MoviesApi {

    // Throw a hashmap on it. (filter uygulamak istersen)

    @GET("/search/movie")
    suspend fun getMovies(
        @QueryMap queries: Map<String, String>
    ) : Response<Movies>

}