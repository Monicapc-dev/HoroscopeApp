package com.monica.horoscopeapp.domain

import com.monica.horoscopeapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}