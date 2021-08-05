package com.alpertign.themoviemanager

import com.alpertign.themoviemanager.Constants.Companion.PATH_END
import com.alpertign.themoviemanager.Constants.Companion.PATH_START
import com.alpertign.themoviemanager.model.Movies
import retrofit2.Response
import retrofit2.http.GET


interface MoviesApi {

    // Throw a hashmap on it.

    @GET(PATH_START+"Breach"+ PATH_END)
    suspend fun getMovies(
    ) : Response<Movies>

}