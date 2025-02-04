package com.example.whatsapp_ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class StatusAdapter(private val statusData: ArrayList<UserData>) : RecyclerView.Adapter<StatusAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.status_card, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = statusData[position]
        holder.statusName.text = currentItem.name
        holder.statusTime.text = currentItem.time
        holder.statusImage.setImageResource(currentItem.image)
    }

    override fun getItemCount(): Int {
        return statusData.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val statusName: TextView = itemView.findViewById(R.id.status_name)
        val statusTime: TextView = itemView.findViewById(R.id.status_time)
        val statusImage: CircleImageView = itemView.findViewById(R.id.status_image)
    }
}
