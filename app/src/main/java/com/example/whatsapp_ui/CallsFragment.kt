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

        val names = arrayOf("Rahul", "Priya", "Amit", "Sneha")
        val times = arrayOf("Yesterday, 8:30 PM", "Today, 12:15 PM", "2 hours ago", "Just now")
        val images = arrayOf(R.drawable.user, R.drawable.man, R.drawable.person, R.drawable.profile)
        val callTypes = arrayOf(R.drawable.ic_call_received, R.drawable.ic_call_made, R.drawable.ic_call_missed, R.drawable.ic_call_received)

        callData = arrayListOf()
        for (index in names.indices) {
            callData.add(UserData(name = names[index], image = images[index], time = times[index], callType = callTypes[index]))
        }

        myRecyclerView.adapter = CallAdapter(callData)

        return view
    }
}
