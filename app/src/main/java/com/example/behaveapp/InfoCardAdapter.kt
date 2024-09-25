package com.example.behaveapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class InfoCardAdapter(private val infoCards: List<InfoCard>) : RecyclerView.Adapter<InfoCardAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.title)
        val description: TextView = view.findViewById(R.id.description)
        val image: ImageView = view.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_info_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val infoCard = infoCards[position]
        holder.title.text = infoCard.title
        holder.description.text = infoCard.description
        // Load image using Glide
        Glide.with(holder.image.context).load(infoCard.imageUrl).into(holder.image)
    }

    override fun getItemCount() = infoCards.size
}

