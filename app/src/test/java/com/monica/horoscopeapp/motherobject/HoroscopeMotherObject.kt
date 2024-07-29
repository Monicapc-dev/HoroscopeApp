package com.monica.horoscopeapp.motherobject

import com.monica.horoscopeapp.data.network.response.PredictionResponse
import com.monica.horoscopeapp.domain.model.HoroscopeInfo
import com.monica.horoscopeapp.domain.model.HoroscopeInfo.*

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date", "prediction", "taurus")

    val horoscopeInfoList = listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius, Pisces
    )
}