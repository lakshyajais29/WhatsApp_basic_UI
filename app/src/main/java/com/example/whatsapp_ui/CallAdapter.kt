package com.example.whatsapp_ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CallAdapter(private val callData: ArrayList<UserData>) : RecyclerView.Adapter<CallAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.call_card, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = callData[position]
        holder.callName.text = currentItem.name
        holder.callTime.text = currentItem.time
        holder.callImage.setImageResource(currentItem.image)
        holder.callType.setImageResource(currentItem.callType ?: R.drawable.ic_call_received) // Default icon if null
    }

    override fun getItemCount(): Int {
        return callData.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val callName: TextView = itemView.findViewById(R.id.call_name)
        val callTime: TextView = itemView.findViewById(R.id.call_time)
        val callImage: CircleImageView = itemView.findViewById(R.id.call_image)
        val callType: ImageView = itemView.findViewById(R.id.call_type)
    }
}
