package com.example.keeptrackfood.adapter

import android.util.Log
import com.example.keeptrackfood.model.Food

import com.example.keeptrackfood.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.keeptrackfood.databinding.RvBinding
import com.example.keeptrackfood.model.FoodBasicModel

class HomeRecylerViewAdapter(val data: ArrayList<Food>): RecyclerView.Adapter<HomeRecylerViewAdapter.FoodViewHolder>() {



    class FoodViewHolder(var view: RvBinding ) : RecyclerView.ViewHolder(view.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        //val view = inflater.inflate(R.layout.item_country,parent,false)
        val view = DataBindingUtil.inflate<RvBinding>(inflater,R.layout.rv,parent,false)
        Log.e("***12313131****","geld2i")
        return FoodViewHolder(view)

    }


    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        var currData = data[position]
        Log.e("9929292992",currData.image+"****1")
        holder.view.foodxml = FoodBasicModel(currData.foodId,currData.label,currData.nutrients.eNERCKCAL.toString(),currData.image)
        holder.view.str =currData.label
        Log.e("***12313131****",currData.label)
        Log.e("***12313131****","geldi")
    }

    /*


    holder.view.name.text = countryList[position].countryName
    holder.view.region.text = countryList[position].countryRegion

    holder.view.setOnClickListener {
        val action = FeedFragmentDirections.actionFeedFragmentToCountryFragment(countryList[position].uuid)
        //action.countryUuid
        Navigation.findNavController(it).navigate(action)
    }

    holder.view.imageView.downloadFromUrl(countryList[position].imageUrl, placeholderProgressBar(holder.view.context))
*/

/*
    fun updateCountryList(newCountryList: List<Country>) {
        countryList.clear()
        countryList.addAll(newCountryList)
        notifyDataSetChanged()
    }

    override fun onCountryClicked(v: View) {
        val uuid = v.countryUuidText.text.toString().toInt()
        val action = FeedFragmentDirections.actionFeedFragmentToCountryFragment()
        action.countryUuid = uuid
        Navigation.findNavController(v).navigate(action)

    }*/
}