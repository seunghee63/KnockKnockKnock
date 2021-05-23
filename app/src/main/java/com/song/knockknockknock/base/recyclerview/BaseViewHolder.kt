package com.song.knockknockknock.base.recyclerview

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

open class BaseViewHolder<T>(
    private val binding: ViewDataBinding,
    private val variableId: Int
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: T) {
        binding.setVariable(variableId, item)
        binding.executePendingBindings()
    }
}