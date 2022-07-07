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
    ) : RecyclerView.Adapter<CommonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommonViewHolder {
        return ViewType.getViewHolder(parent, viewType)
    }

    override fun onBindViewHolder(holder: CommonViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size

    override fun getItemViewType(position: Int): Int {
        return ViewType.valueOf(dataSet[position].viewType).ordinal
    }
}