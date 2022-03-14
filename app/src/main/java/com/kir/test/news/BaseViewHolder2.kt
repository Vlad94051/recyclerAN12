package com.kir.test.news

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder2(itemView: View) : RecyclerView.ViewHolder(itemView) {
   abstract fun bindItem(item: BaseItem)
}