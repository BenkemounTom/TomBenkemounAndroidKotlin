package com.example.tombenkemounandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager


import kotlinx.android.synthetic.main.activity_kotlin_recycler_view_ex.*
import androidx.recyclerview.widget.RecyclerView.LayoutManager as LayoutManager

class KotlinRecyclerViewEx : AppCompatActivity() {

    private lateinit var blogRecyclerAdapter: BlogRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_recycler_view_ex)
        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        blogRecyclerAdapter.submitList(data)
    }



    private fun initRecyclerView(){
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@KotlinRecyclerViewEx)
            blogRecyclerAdapter = BlogRecyclerAdapter()
            val topSpacingItemDecorations = TopSpacingItemDecorations(40)
            addItemDecoration(topSpacingItemDecorations)
            adapter = blogRecyclerAdapter

        }

    }
}
