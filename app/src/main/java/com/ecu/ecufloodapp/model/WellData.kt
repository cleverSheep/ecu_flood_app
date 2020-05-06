package com.ecu.ecufloodapp.model

data class WellData(
    val id: Int,
    val elevation: Int,
    val lancover: Int,
    val latlng: Double,
    val precipitation: Int?,
    val underground_water: Int?
)