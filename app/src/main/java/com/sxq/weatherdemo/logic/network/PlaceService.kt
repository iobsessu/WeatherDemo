package com.sxq.weatherdemo.logic.network

import com.sxq.weatherdemo.WeatherApplication
import com.sxq.weatherdemo.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${WeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}