package com.example.commonrecyclerview.viewholder

import com.bumptech.glide.Glide
import com.example.commonrecyclerview.data.CommonItem
import com.example.commonrecyclerview.data.viewobject.OneImageViewObject
import com.example.commonrecyclerview.data.viewobject.ViewObject
import com.example.commonrecyclerview.databinding.ItemOneImageBinding

class OneImageViewHolder(
    private val binding: ItemOneImageBinding
) : CommonViewHolder(binding) {
    override fun bind(item: CommonItem) {
        val viewObject = item.viewObject as OneImageViewObject
        Glide.with(binding.root)
            .load(viewObject.url)
            .into(binding.image)
    }
}