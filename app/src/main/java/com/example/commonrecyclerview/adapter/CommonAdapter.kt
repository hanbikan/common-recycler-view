package com.example.commonrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.commonrecyclerview.R
import com.example.commonrecyclerview.data.CommonItem
import com.example.commonrecyclerview.utility.ViewType

class CommonAdapter(
    private val dataSet: Array<CommonItem>
    ) : RecyclerView.Adapter<GeneralViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GeneralViewHolder {
        /** 새로운 뷰타입이 생길 때마다 분기를 추가해야 합니다. */
        return when(viewType) {
            ViewType.ONE_LINE_TEXT.ordinal ->
                GeneralViewHolder.OneLineTextViewHolder(
                    getViewDataBinding(parent, R.layout.item_one_line_text))
            ViewType.TWO_LINE_TEXT.ordinal ->
                GeneralViewHolder.TwoLineTextViewHolder(
                    getViewDataBinding(parent, R.layout.item_two_line_text))
            else ->
                GeneralViewHolder.OneImageViewHolder(
                    getViewDataBinding(parent, R.layout.item_one_image))
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

    override fun onBindViewHolder(holder: GeneralViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size

    override fun getItemViewType(position: Int): Int {
        return ViewType.valueOf(dataSet[position].viewType).ordinal
    }
}