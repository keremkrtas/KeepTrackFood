package com.example.keeptrackfood.reterofit

class ApiUtils {
    companion object{
        fun getFoodDaoInterface():FoodDao{
            return RetrofitClient.getClient().create(FoodDao::class.java)
        }
    }
}