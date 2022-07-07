package com.example.commonrecyclerview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.commonrecyclerview.data.CommonItem
import com.example.commonrecyclerview.utility.CommonViewHolderFactory
import com.example.commonrecyclerview.utility.ViewType
import com.example.commonrecyclerview.viewholder.CommonViewHolder

class CommonAdapter(
    private val dataSet: Array<CommonItem>
    ) : RecyclerView.Adapter<CommonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommonViewHolder {
        return CommonViewHolderFactory.createViewHolder(parent, viewType)
    }

    override fun onBindViewHolder(holder: CommonViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size

    override fun getItemViewType(position: Int): Int {
        return ViewType.valueOf(dataSet[position].viewType).ordinal
    }
}