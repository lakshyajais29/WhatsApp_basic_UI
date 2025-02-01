package com.example.whatsapp_ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(var userdata: ArrayList<UserData>, var context: MainActivity) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.eachcard, parent, false)
        return MyViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        val currentItem = userdata[position]

        holder.name.text = currentItem.name
        holder.message.text = currentItem.message
        holder.time.text = currentItem.time
        holder.image.setImageResource(currentItem.image)
    }

    override fun getItemCount(): Int {
        return userdata.size
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.textView)
        val message: TextView = itemView.findViewById(R.id.textView1)
        val time: TextView = itemView.findViewById(R.id.textview2)
        val image: CircleImageView = itemView.findViewById(R.id.image)
    }
}