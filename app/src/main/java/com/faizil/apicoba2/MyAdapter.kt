package com.faizil.apicoba2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class MyAdapter(val context: Context, val userList: List<ListDataItem>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        var namaidTv: TextView
        var namaTv: TextView

        init {
            namaidTv = itemView.namaidTv
            namaTv = itemView.namaTv
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaidTv.text = userList[position].id.toString()
        holder.namaTv.text = userList[position].nama.toString()
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}