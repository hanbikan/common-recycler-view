package com.example.commonrecyclerview.adapter

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.commonrecyclerview.data.CommonItem
import com.example.commonrecyclerview.data.ViewObject
import com.example.commonrecyclerview.databinding.ItemOneImageBinding
import com.example.commonrecyclerview.databinding.ItemOneLineTextBinding
import com.example.commonrecyclerview.databinding.ItemTwoLineTextBinding

/** 새로운 뷰타입이 생길 때마다 뷰홀더를 추가해야 합니다. */
sealed class GeneralViewHolder(
        binding: ViewDataBinding
    ) : RecyclerView.ViewHolder(binding.root) {
    abstract fun bind(item: CommonItem)

    class OneLineTextViewHolder(
        private val binding: ItemOneLineTextBinding
        ) : GeneralViewHolder(binding) {
        override fun bind(item: CommonItem) {
            val viewObject = item.viewObject as ViewObject.OneLineTextViewObject
            binding.textContents.text = viewObject.contents
        }
    }
    class TwoLineTextViewHolder(
        private val binding: ItemTwoLineTextBinding
    ) : GeneralViewHolder(binding) {
        override fun bind(item: CommonItem) {
            val viewObject = item.viewObject as ViewObject.TwoLineTextViewObject
            binding.textTitle.text = viewObject.title
            binding.textContents.text = viewObject.contents
        }
    }
    class OneImageViewHolder(
        private val binding: ItemOneImageBinding
    ) : GeneralViewHolder(binding) {
        override fun bind(item: CommonItem) {
            val viewObject = item.viewObject as ViewObject.OneImageViewObject
            Glide.with(binding.root)
                .load(viewObject.url)
                .into(binding.image)
        }
    }
}