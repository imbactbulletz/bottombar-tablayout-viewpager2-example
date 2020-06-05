package com.example.bottombarandtablayoutexample.adapter.diffutil

import androidx.recyclerview.widget.DiffUtil

class QuoteDiffUtilItemCallback : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}