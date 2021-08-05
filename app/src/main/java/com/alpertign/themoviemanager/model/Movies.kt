package com.alpertign.themoviemanager.model


import com.google.gson.annotations.SerializedName

data class Movies(
    @SerializedName("results")
    val results: List<Result>?
)