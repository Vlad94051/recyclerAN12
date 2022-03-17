package com.kir.test.presentation.news

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kir.test.base.BaseViewHolder2
import java.lang.IllegalStateException

class NewsAdapter : RecyclerView.Adapter<BaseViewHolder2>() {

    private var items: List<BaseItem> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder2 {
        return when (viewType) {
            DateViewHolder.VIEW_TYPE -> DateViewHolder.newInstance(parent)
            NewsViewHolder.VIEW_TYPE -> NewsViewHolder.newInstance(parent)
            else -> throw IllegalStateException("Wrong view holder type")
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder2, position: Int) {
        holder.bindItem(item = items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is Date -> DateViewHolder.VIEW_TYPE
            is News -> NewsViewHolder.VIEW_TYPE
            else -> 0
        }
    }

    override fun getItemCount(): Int = items.size

    fun submitList(data: List<BaseItem>) {
        items = data
        notifyDataSetChanged()
    }
}