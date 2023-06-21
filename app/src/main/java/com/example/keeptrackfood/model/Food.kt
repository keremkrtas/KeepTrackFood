package com.example.keeptrackfood.model


import com.google.gson.annotations.SerializedName

data class Food(
    @SerializedName("brand")
    val brand: String,
    @SerializedName("category")
    val category: String,
    @SerializedName("categoryLabel")
    val categoryLabel: String,
    @SerializedName("foodId")
    val foodId: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("knownAs")
    val knownAs: String,
    @SerializedName("label")
    val label: String,
    @SerializedName("nutrients")
    val nutrients: Nutrients
)