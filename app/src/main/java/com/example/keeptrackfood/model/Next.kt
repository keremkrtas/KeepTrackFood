package com.example.keeptrackfood.model


import com.google.gson.annotations.SerializedName

data class Next(
    @SerializedName("href")
    val href: String,
    @SerializedName("title")
    val title: String
)