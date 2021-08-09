package com.alpertign.themoviemanager.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.alpertign.themoviemanager.util.Constants.Companion.API_KEY
import com.alpertign.themoviemanager.util.Constants.Companion.QUERY_API_KEY
import com.alpertign.themoviemanager.util.Constants.Companion.QUERY_QUERY

class MoviesViewModel(application: Application) :AndroidViewModel(application) {

    fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()

        queries[QUERY_API_KEY] = API_KEY
        queries[QUERY_QUERY] = "Breach"


        return queries
    }

}