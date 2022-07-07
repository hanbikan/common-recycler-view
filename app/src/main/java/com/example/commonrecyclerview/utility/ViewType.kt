package com.example.commonrecyclerview.utility

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.commonrecyclerview.R
import com.example.commonrecyclerview.adapter.CommonViewHolder

/** 새로운 뷰타입이 생길 때마다 업데이트해야 합니다. */
enum class ViewType(name: String) {
    ONE_LINE_TEXT("ONE_LINE_TEXT"),
    TWO_LINE_TEXT("TWO_LINE_TEXT"),
    ONE_IMAGE("ONE_IMAGE");

    companion object {
        fun getViewHolder(parent: ViewGroup, viewType: Int): CommonViewHolder {
            return when(viewType) {
                ONE_LINE_TEXT.ordinal -> CommonViewHolder
                    .OneLineTextViewHolder(getViewDataBinding(parent, R.layout.item_one_line_text))
                TWO_LINE_TEXT.ordinal -> CommonViewHolder
                    .TwoLineTextViewHolder(getViewDataBinding(parent, R.layout.item_two_line_text))
                else -> CommonViewHolder
                    .OneImageViewHolder(getViewDataBinding(parent, R.layout.item_one_image))
            }
        }

        private fun <T: ViewDataBinding> getViewDataBinding(parent: ViewGroup, layoutRes: Int): T {
            return DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                layoutRes,
                parent,
                false
            )
        }
    }
}