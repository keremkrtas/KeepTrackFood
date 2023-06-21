package com.example.keeptrackfood.model


import com.google.gson.annotations.SerializedName

data class Qualifier(
    @SerializedName("label")
    val label: String,
    @SerializedName("uri")
    val uri: String
)