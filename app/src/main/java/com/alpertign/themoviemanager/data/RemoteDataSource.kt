package com.alpertign.themoviemanager.data

import com.alpertign.themoviemanager.data.network.MoviesApi
import com.alpertign.themoviemanager.model.Movies
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val moviesApi: MoviesApi
    ){

    suspend fun getMovies(queries: Map<String, String>): Response<Movies>{
        return moviesApi.getMovies(queries)
    }

}