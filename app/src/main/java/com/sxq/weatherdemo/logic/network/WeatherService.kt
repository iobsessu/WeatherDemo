package com.sxq.weatherdemo.logic.network

import com.sxq.weatherdemo.WeatherApplication
import com.sxq.weatherdemo.logic.model.DailyResponse
import com.sxq.weatherdemo.logic.model.PlaceResponse
import com.sxq.weatherdemo.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WeatherService {

    /**
     * 获取实时天气
     */
    @GET("v2.5/${WeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<RealtimeResponse>

    /**
     * 获取未来几天的信息
     */
    @GET("v2.5/${WeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>

}