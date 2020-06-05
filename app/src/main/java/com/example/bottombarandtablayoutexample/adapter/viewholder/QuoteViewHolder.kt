package com.example.bottombarandtablayoutexample.adapter.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.list_item_quote.*

class QuoteViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
    LayoutContainer {

    fun onBind(quote: String) {
        quoteContentTextView.text = quote
    }
}