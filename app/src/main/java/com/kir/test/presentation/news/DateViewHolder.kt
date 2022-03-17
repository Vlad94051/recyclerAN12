package com.kir.test.presentation.news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kir.test.R
import com.kir.test.base.BaseViewHolder2

class DateViewHolder(itemView: View) : BaseViewHolder2(itemView) {

    companion object {
        const val VIEW_TYPE = 1

        fun newInstance(parent: ViewGroup) = DateViewHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(
                R.layout.item_date,
                parent,
                false
            )
        )
    }

    private val dateTextView by lazy { itemView.findViewById<TextView>(R.id.dateTv) }

    override fun bindItem(item: BaseItem) {
        (item as Date).apply {
            dateTextView.text = date
        }
    }
}