package com.ecu.ecufloodapp.api

import com.ecu.ecufloodapp.model.WellData
import retrofit2.Call
import retrofit2.http.*

interface WellService {
    @GET("file:///C:/Users/murra/OneDrive/Documents/Flood%20Rish%20Project/well_data.json")
    fun fetchWellData(@Path("wellId") id: Int): Call<List<WellData>>

    @Headers("Content-Type: application/json")
    @POST("file:///C:/Users/murra/OneDrive/Documents/Flood%20Rish%20Project/flood_prediction.json")
    fun fetchFloodRisk(@Body jsonWellData: String): Call<Double>
}