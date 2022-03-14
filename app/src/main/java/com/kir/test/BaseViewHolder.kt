package com.kir.test

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<I>(itemView: View): RecyclerView.ViewHolder(itemView) {
    abstract fun bindViewHolder(item: I)
}
