package com.example.keeptrackfood.model


import com.google.gson.annotations.SerializedName

data class Hint(
    @SerializedName("food")
    val food: Food,
    @SerializedName("measures")
    val measures: List<Measure>
)