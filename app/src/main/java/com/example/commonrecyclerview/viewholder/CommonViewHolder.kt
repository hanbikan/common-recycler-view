package com.example.commonrecyclerview.viewholder

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.commonrecyclerview.data.CommonItem

/** 새로운 뷰타입이 생길 때마다 자식 뷰홀더를 추가해야 합니다. */
abstract class CommonViewHolder(
        binding: ViewDataBinding
    ) : RecyclerView.ViewHolder(binding.root) {
    abstract fun bind(item: CommonItem)
}