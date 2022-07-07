package com.example.commonrecyclerview.viewholder

import com.example.commonrecyclerview.data.CommonItem
import com.example.commonrecyclerview.data.viewobject.OneLineTextViewObject
import com.example.commonrecyclerview.data.viewobject.ViewObject
import com.example.commonrecyclerview.databinding.ItemOneLineTextBinding

class OneLineTextViewHolder(
    private val binding: ItemOneLineTextBinding
) : CommonViewHolder(binding) {
    override fun bind(item: CommonItem) {
        val viewObject = item.viewObject as OneLineTextViewObject
        binding.textContents.text = viewObject.contents
    }
}
