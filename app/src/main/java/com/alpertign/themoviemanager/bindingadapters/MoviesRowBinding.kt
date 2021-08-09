package com.alpertign.themoviemanager.bindingadapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load
import com.alpertign.themoviemanager.util.Constants.Companion.POSTER_PATH_START

class MoviesRowBinding {

    companion object{

        @BindingAdapter("loadPosterFromUrl")
        @JvmStatic
        fun loadPosterFromUrl(imageView: ImageView, posterUrl: String){
            imageView.load(POSTER_PATH_START+posterUrl){
                crossfade(600)
            }
        }
    }
}