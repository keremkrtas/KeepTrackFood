package com.example.keeptrackfood.model


import com.google.gson.annotations.SerializedName

data class Qualified(
    @SerializedName("qualifiers")
    val qualifiers: List<Qualifier>,
    @SerializedName("weight")
    val weight: Int
)