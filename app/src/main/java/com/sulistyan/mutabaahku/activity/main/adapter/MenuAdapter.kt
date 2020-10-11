package com.sulistyan.mutabaahku.activity.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sulistyan.mutabaahku.R
import kotlinx.android.synthetic.main.item_menu.view.*

class MenuAdapter(val onMenuClick : OnMenuClick) : RecyclerView.Adapter<MenuAdapter.MyHolder>() {
    private val menu = arrayOf(
        arrayOf(R.drawable.ic_mutabaah,"Mutabaah"),
        arrayOf(R.drawable.ic_goods,"Data Barang"),
        arrayOf(R.drawable.ic_shopping_cart, "Penjualan"),
        arrayOf(R.drawable.ic_report, "Riwayat"))

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int = menu.size

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(menu.get(position)[0] as Int, menu.get(position)[1] as String)
        holder.itemView.setOnClickListener {
            onMenuClick.onClick(menu.get(position)[0] as Int)
        }
    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(any: Int, any1: String) {
            itemView.menuImage.setImageResource(any)
            itemView.menuText.text = any1
        }

    }

    interface OnMenuClick {
        fun onClick(image : Int)
    }
}