package com.example.keeptrackfood.reterofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object {
        fun getClient(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://api.edamam.com/api/food-database/v2/")
                .addConverterFactory(GsonConverterFactory.create()).build()
        }
    }
}