package com.example.commonrecyclerview.viewholder

import com.example.commonrecyclerview.data.CommonItem
import com.example.commonrecyclerview.data.viewobject.TwoLineTextViewObject
import com.example.commonrecyclerview.data.viewobject.ViewObject
import com.example.commonrecyclerview.databinding.ItemTwoLineTextBinding

class TwoLineTextViewHolder(
    private val binding: ItemTwoLineTextBinding
) : CommonViewHolder(binding) {
    override fun bind(item: CommonItem) {
        val viewObject = item.viewObject as TwoLineTextViewObject
        binding.textTitle.text = viewObject.title
        binding.textContents.text = viewObject.contents
    }
}