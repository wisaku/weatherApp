package com.example.saba.weatherapp.services

import com.example.saba.weatherapp.model.FiveDaysWeather
import com.example.saba.weatherapp.model.Weather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query



interface WeatherService {

    @GET("/data/2.5/weather")
    fun getWeather(@Query("lat") lat:Double?, @Query("lon") lon:Double?, @Query("q") q: String?) : Call<Weather>

    @GET("/data/2.5/forecast")
    fun getFiveDaysWeather(@Query("lat") lat:Double?, @Query("lon") lon:Double?, @Query("q") q : String?) : Call<FiveDaysWeather>



}