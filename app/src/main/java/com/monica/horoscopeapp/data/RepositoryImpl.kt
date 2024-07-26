package com.monica.horoscopeapp.data

import android.util.Log
import com.monica.horoscopeapp.data.network.HoroscopeApiService
import com.monica.horoscopeapp.data.network.response.PredictionResponse
import com.monica.horoscopeapp.domain.Repository
import com.monica.horoscopeapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("moni", "Error ${it.message}") }
        return null
    }
}