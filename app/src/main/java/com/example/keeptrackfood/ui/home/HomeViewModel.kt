package com.example.keeptrackfood.ui.home

import android.util.Log
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.keeptrackfood.model.AllFoodModel
import com.example.keeptrackfood.model.Food
import com.example.keeptrackfood.model.Hint
import com.example.keeptrackfood.model.Nutrients
import com.example.keeptrackfood.reterofit.ApiUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _food = MutableLiveData<ArrayList<Food>>().apply {
        value = ArrayList<Food>()
    }
    val food: LiveData<ArrayList<Food>> = _food

    /*private var _hint = MutableLiveData<Hint>().apply {
    }
    var hint: LiveData<Hint> = _hint
*/
    lateinit var hint: MutableLiveData<List<Hint>>
    init {
        hint= MutableLiveData()
    }

    fun allFoods(o: LifecycleOwner) {
        val foodDif = ApiUtils.getFoodDaoInterface()

        foodDif.allFoods().enqueue(object : Callback<AllFoodModel> {
            override fun onResponse(call: Call<AllFoodModel>, response: Response<AllFoodModel>) {
                println("00000000")

                Log.e("******", response.body()!!.hints.toString())
                val body = response.body()!!.hints
                if (response.body()!=null){
                    hint.postValue(response.body()!!.hints)
                }

                for (i in body) {
                    //   food.value?.add(i.food)
                    food.value!!.add(i.food)
                    //   Log.e("TA********G", food.value!![].label)
                    Log.e("----******----", i.food.label)
                }
            }

            override fun onFailure(call: Call<AllFoodModel>, t: Throwable) {
                Log.e("*******", t.localizedMessage!!)
            }

        })
    }
}
