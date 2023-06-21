package com.example.keeptrackfood.model


import com.google.gson.annotations.SerializedName

data class Measure(
    @SerializedName("label")
    val label: String,
    @SerializedName("qualified")
    val qualified: List<Qualified>,
    @SerializedName("uri")
    val uri: String,
    @SerializedName("weight")
    val weight: Double
)