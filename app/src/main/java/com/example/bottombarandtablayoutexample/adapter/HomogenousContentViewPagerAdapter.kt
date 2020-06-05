package com.example.bottombarandtablayoutexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.bottombarandtablayoutexample.R
import com.example.bottombarandtablayoutexample.adapter.viewholder.QuoteViewHolder
import com.google.android.material.tabs.TabLayoutMediator

class HomogenousContentViewPagerAdapter(diffUtil: DiffUtil.ItemCallback<String>): ListAdapter<String, QuoteViewHolder>(diffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_quote, parent, false)
        return QuoteViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }
}