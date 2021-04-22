package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RvAdt : RecyclerView.Adapter<ItemVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemVH {
        return ItemVH(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: ItemVH, position: Int) {

    }

    override fun getItemCount(): Int {
        return 100
    }
}

class ItemVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

}