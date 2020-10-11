package com.sulistyan.mutabaahku.activity.mutabaah_tilawah.adapter

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sulistyan.mutabaahku.R
import com.sulistyan.mutabaahku.model.MutabaahTilawah
import kotlinx.android.synthetic.main.item_data_mutabaah_kegiatantilawah.view.*

class MutabaahTilawahAdapter(val mutabaahTilawah: List<MutabaahTilawah?>?, val onMenuClicked: OnMenuClicked) :
    RecyclerView.Adapter<MutabaahTilawahAdapter.MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_data_mutabaah_kegiatantilawah, parent, false)
        return MyHolder(v)
    }

    override fun getItemCount(): Int = mutabaahTilawah?.size ?: 0

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(mutabaahTilawah?.get(position))

        holder.itemView.ivMenuBarang.setOnClickListener {

        }
    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(mutabaahTilawah: MutabaahTilawah?) {
            itemView.tvBarcode.text = mutabaahTilawah?.tanggal
            itemView.tvNamaBarang.text = mutabaahTilawah?.surat.toString()
            itemView.tvCategory.text = mutabaahTilawah?.ayat.toString()
        }
    }

    interface OnMenuClicked {
        fun click(menuItem: MenuItem, mutabaahTilawah: MutabaahTilawah?)
    }
}