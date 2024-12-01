package com.example.weatherapp.data.repository

import com.example.weatherapp.data.api.NetworkService
import com.example.weatherapp.data.model.City
import com.example.weatherapp.data.model.Weather
import javax.inject.Inject

const val Apikey = "jiXVfl2xAtzzIG2F1xGa7wqETGliE06u"

class WeatherRepository @Inject constructor(
    private val networkService: NetworkService
) {
    suspend fun getCities(city: String): com.example.weatherapp.data.model.Result<List<City>> {
        return try {
            val result = networkService.getCities(city, Apikey)
            if (result.isSuccessful && result.body() != null) {
                com.example.weatherapp.data.model.Result.Success(result.body()!!)
            } else {
                com.example.weatherapp.data.model.Result.Error(result.errorBody()?.string() ?: "Unknown error occurred")
            }
        } catch (e: Exception) {
            com.example.weatherapp.data.model.Result.Error(e.localizedMessage ?: "Network request failed")
        }
    }

    suspend fun getWeather(url: String): com.example.weatherapp.data.model.Result<Weather> {
        return try {
            val result = networkService.getWeather(url, Apikey)
            if (result.isSuccessful && result.body() != null) {
                com.example.weatherapp.data.model.Result.Success(result.body()!!)
            } else {
                com.example.weatherapp.data.model.Result.Error(result.errorBody()?.string() ?: "Unknown error occurred")
            }
        } catch (e: Exception) {
            com.example.weatherapp.data.model.Result.Error(e.localizedMessage ?: "Network request failed")
        }
    }
}

