package com.kir.test.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.kir.test.presentation.news.BaseItem

abstract class BaseViewHolder2(itemView: View) : RecyclerView.ViewHolder(itemView) {
   abstract fun bindItem(item: BaseItem)
}