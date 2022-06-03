package com.example.eyeshadow

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.eyeshadow.network.Eyeshadow
import com.example.eyeshadow.ui.EyeshadowListAdapter

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<Eyeshadow>?) {
    val adapter = recyclerView.adapter as EyeshadowListAdapter
    adapter.submitList(data)
}