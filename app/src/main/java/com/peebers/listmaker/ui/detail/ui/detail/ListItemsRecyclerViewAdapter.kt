package com.peebers.listmaker.ui.detail.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peebers.listmaker.TaskList
import com.peebers.listmaker.databinding.ListItemViewHolderBinding

class ListItemsRecyclerViewAdapter(var list: TaskList) : RecyclerView.Adapter<ListItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val binding = ListItemViewHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.binding.textViewTask.text = list.tasks[position]
    }

    override fun getItemCount(): Int {
        return list.tasks.size
    }
}