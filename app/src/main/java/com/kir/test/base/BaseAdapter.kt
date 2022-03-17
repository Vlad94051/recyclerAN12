package com.kir.test.base

import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<I, VH: BaseViewHolder<I>>: RecyclerView.Adapter<VH>() {

    private var items: List<I> = emptyList()

    override fun onBindViewHolder(holder: VH, position: Int) {
        return holder.bindViewHolder(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun submitList(data: List<I>) {
        notifyDataSetChanged()
        items = data
    }
}