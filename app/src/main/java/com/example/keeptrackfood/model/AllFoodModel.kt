package com.example.keeptrackfood.model


import com.google.gson.annotations.SerializedName

data class AllFoodModel(
    @SerializedName("hints")
    val hints: List<Hint>,
    @SerializedName("_links")
    val links: Links,
    @SerializedName("parsed")
    val parsed: List<Any>,
    @SerializedName("text")
    val text: String
)