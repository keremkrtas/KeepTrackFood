package com.example.keeptrackfood.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.keeptrackfood.adapter.HomeRecylerViewAdapter
import com.example.keeptrackfood.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var homeViewModel: HomeViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        textView.text = homeViewModel.text.value
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homeViewModel.allFoods(this)
        // set up the RecyclerView

        // set up the RecyclerView
        homeViewModel.hint.observe(viewLifecycleOwner) {
            if (it != null) {

                val recyclerView: RecyclerView = binding.rvHome
                recyclerView.layoutManager = LinearLayoutManager(context)
                val adapter: HomeRecylerViewAdapter = HomeRecylerViewAdapter(homeViewModel.food.value!!)
                recyclerView.adapter = adapter
            }
        }
        binding.textHome.setOnClickListener {
            Log.e("tıkaq", homeViewModel.food.value.toString())
            Log.e("1234567890", homeViewModel.food.value.toString())
            Log.e("09009090990",homeViewModel.hint.value.toString())
        }

    }
}