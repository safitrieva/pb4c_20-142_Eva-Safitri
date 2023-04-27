package com.example.recyclereva

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PahlawanAdapter(private val pahlawanlist:ArrayList<pahlawan>)
    : RecyclerView.Adapter<PahlawanAdapter.PahlawanViewHolder>(){

    var onItemClick : ((pahlawan) -> Unit)? = null

    class PahlawanViewHolder(itemView: View) :  RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PahlawanAdapter.PahlawanViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.eva_item , parent , false)
        return PahlawanViewHolder(view)
    }

    override fun onBindViewHolder(holder: PahlawanViewHolder, position: Int) {
        val pahlawan = pahlawanlist[position]
        holder.imageView.setImageResource(pahlawan.image as Int)
        holder.textView.text = pahlawan.name

        holder.itemView.setOnClickListener {
                onItemClick?.invoke(pahlawan)
        }
    }

    override fun getItemCount(): Int {
        return pahlawanlist.size
    }
}