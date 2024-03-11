package com.example.appmetereologia.data.repository

import com.example.appmetereologia.data.model.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Float, lng: Float): WeatherInfo

}