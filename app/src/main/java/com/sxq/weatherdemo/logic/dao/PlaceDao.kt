package com.sxq.weatherdemo.logic.dao

import android.content.Context
import com.google.gson.Gson
import androidx.core.content.edit
import com.sxq.weatherdemo.WeatherApplication
import com.sxq.weatherdemo.logic.model.Place

object PlaceDao {

    fun savePlace(place: Place) {
        sharePreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharePreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharePreferences().contains("place")

    private fun sharePreferences() = WeatherApplication.context.getSharedPreferences("weather", Context.MODE_PRIVATE)
}