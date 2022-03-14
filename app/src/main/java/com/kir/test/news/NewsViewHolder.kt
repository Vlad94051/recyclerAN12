package com.kir.test.news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kir.test.R

class NewsViewHolder(itemView: View) : BaseViewHolder2(itemView) {

    companion object {
        const val VIEW_TYPE = 2

        fun newInstance(parent: ViewGroup) = NewsViewHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(
                R.layout.item_news,
                parent,
                false
            )
        )
    }

    private val titleTextView by lazy { itemView.findViewById<TextView>(R.id.titleTv) }

    override fun bindItem(item: BaseItem) {
        (item as News).apply {
            titleTextView.text = title
        }
    }
}