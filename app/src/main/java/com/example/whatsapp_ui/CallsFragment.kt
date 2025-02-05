package com.example.whatsapp_ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CallsFragment : Fragment() {

    lateinit var myRecyclerView: RecyclerView
    lateinit var callData: ArrayList<UserData>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_calls, container, false)

        myRecyclerView = view.findViewById(R.id.recyclerview1)
        myRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        val names = arrayOf("Rahul", "Priya", "Amit", "Sneha","Arjun", "Sanya", "Vikram", "Riya", "Manav", "Tanya")
        val times = arrayOf("Yesterday, 8:30 PM", "Today, 12:15 PM", "2 hours ago", "Just now","Yesterday, 7:15 PM", "Today, 9:45 AM", "3 minutes ago", "Yesterday, 10:20 AM", "1 minutes ago", "Yesterday, 4:10 PM")
        val images = arrayOf(R.drawable.user, R.drawable.man, R.drawable.person, R.drawable.profile,R.drawable.avatar,R.drawable.programmer,R.drawable.housekeeper,R.drawable.man3, R.drawable.profile, R.drawable.user2)
        val callTypes = arrayOf(R.drawable.ic_call_received, R.drawable.ic_call_made, R.drawable.ic_call_missed, R.drawable.ic_call_received,R.drawable.ic_call_received,R.drawable.ic_call_made,R.drawable.ic_call_missed,R.drawable.ic_call_received,R.drawable.ic_call_made,R.drawable.ic_call_received)

        callData = arrayListOf()
        for (index in names.indices) {
            callData.add(UserData(name = names[index], image = images[index], time = times[index], callType = callTypes[index]))
        }

        myRecyclerView.adapter = CallAdapter(callData)

        return view
    }
}
