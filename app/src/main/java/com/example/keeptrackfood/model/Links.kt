package com.example.keeptrackfood.model


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("next")
    val next: Next
)