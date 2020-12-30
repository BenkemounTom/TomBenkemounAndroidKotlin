package com.example.tombenkemounandroidkotlin.presentation.Main

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tombenkemounandroidkotlin.domain.entity.PokemonResponse
import kotlinx.android.synthetic.main.activity_kotlin_recycler_view_ex.view.*
import org.koin.android.ext.android.inject
import com.example.tombenkemounandroidkotlin.R





class ActivityList: AppCompatActivity() {
    private val listViewModel : ViewModelList by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitylist)

        listViewModel.makeAPICall()
        listViewModel.apiLiveData.observe(this, Observer {
            when(it){
                is APICallSuccess -> {
                    showList(it.charList)
                }
                APICallFailure -> {
                    Toast.makeText(this, "API Not Good", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

    private fun showList(characters: List<PokemonResponse>){
        val recyclerView = findViewById<View>(R.id.recycler_view) as RecyclerView
        recyclerView.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val myAdapter = AdapterList(characters)
        print(myAdapter.itemCount)
        recyclerView.adapter = myAdapter
    }
}