package com.alpertign.themoviemanager

class Constants {

    companion object{

        const val API_KEY = "b9ade068929d0b089949c527a8192f70"
        const val PATH_START = "/3/search/movie?api_key=b9ade068929d0b089949c527a8192f70&query="
        const val PATH_END = "&page=1&include_adult=false"
        const val BASE_URL = "https://api.themoviedb.org"

        const val POSTER_PATH_START = "https://image.tmdb.org/t/p/w200"
        const val BACKDROP_PATH_START = "https://image.tmdb.org/t/p/w400"


    }

}

// https://image.tmdb.org/t/p/w200/4dm5XEXIT73aB0g1nrplwYguaU9.jpg
// https://image.tmdb.org/t/p/w200      ->      posterpath
// /4dm5XEXIT73aB0g1nrplwYguaU9.jpg      ->      image path


// Search query for "Breach"
// https://api.themoviedb.org/3/search/movie?api_key=b9ade068929d0b089949c527a8192f70&query=Breach&page=1&include_adult=false
// BASE URL     ->       https://api.themoviedb.org
// Path         ->      /3/search/movie?api_key=b9ade068929d0b089949c527a8192f70&query=      +       Breach      +       &page=1&include_adult=false
