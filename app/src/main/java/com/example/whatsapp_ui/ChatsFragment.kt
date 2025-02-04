package com.example.whatsapp_ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChatsFragment : Fragment() {

    lateinit var myRecyclerView: RecyclerView
    lateinit var userdata: ArrayList<UserData>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_chats, container, false)

        myRecyclerView = view.findViewById(R.id.recyclerview)
        myRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        val name = arrayOf("Arjun", "Priya", "Rohan", "Ananya")
        val message = arrayOf("Hey!", "How are you?", "Call me", "Meeting at 5?")
        val image = arrayOf(R.drawable.man3, R.drawable.profile, R.drawable.user2, R.drawable.user5)
        val time = arrayOf("08:15 AM", "09:30 AM", "10:45 AM", "11:20 AM")

        userdata = arrayListOf()
        for (index in name.indices) {
            userdata.add(UserData(name[index], message[index], image[index], time[index]))
        }

        myRecyclerView.adapter = ChatsAdapter(userdata,this)

        return view
    }
}
