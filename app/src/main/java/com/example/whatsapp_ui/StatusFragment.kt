package com.example.whatsapp_ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StatusFragment : Fragment() {

    lateinit var myRecyclerView: RecyclerView
    lateinit var statusData: ArrayList<UserData>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_status, container, false)

        myRecyclerView = view.findViewById(R.id.recyclerview2)
        myRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        val names = arrayOf("Rohan", "Meera", "Sanya", "Karan")
        val times = arrayOf("10 minutes ago", "Today, 2:30 PM", "Yesterday, 9:15 AM", "Just now")
        val images = arrayOf(R.drawable.user, R.drawable.person, R.drawable.man, R.drawable.profile)

        statusData = arrayListOf()
        for (index in names.indices) {
            statusData.add(UserData(names[index], times[index], images[index]))
        }

        myRecyclerView.adapter = StatusAdapter(statusData)

        return view
    }
}
