package com.example.keeptrackfood.reterofit

import com.example.keeptrackfood.model.AllFoodModel
import retrofit2.Call
import retrofit2.http.GET

interface FoodDao {
    @GET("parser?app_id=bad23cbc&app_key=cd8dcb861f7d7f69da9377fd507d704b&calories=700-900")
    fun allFoods(): Call<AllFoodModel>
}
