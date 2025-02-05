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

        val name = arrayOf("Arjun", "Priya", "Rohan", "Ananya","Ananya", "Rohan", "Ishita", "Aryan", "Neha", "Vivaan", "Sneha", "Rahul", "Pooja", "Kabir", "Simran", "Aarav", "Priya", "Aditya", "Meera", "Kunal")
        val message = arrayOf("Hey!", "How are you?", "Call me", "Meeting at 5?","Hey, what's up?", "Call me when you're free.", "Did you reach home?", "Let’s meet tomorrow!", "Good night 😊", "I’ll text you later.", "Send me the details.", "Where are you?", "Okay, no problem!", "Haha, that’s funny! 😂", "I’m on my way.", "Sorry, I missed your call.", "Did you complete the assignment?", "Talk to you later!", "Happy Birthday! 🎉", "See you soon!")
        val image = arrayOf(R.drawable.man,R.drawable.user7,R.drawable.girl,R.drawable.bussiness,R.drawable.avatar,R.drawable.programmer,R.drawable.housekeeper,R.drawable.man3, R.drawable.profile, R.drawable.user2, R.drawable.user5,R.drawable.user6,R.drawable.person,R.drawable.girl,R.drawable.bussiness,R.drawable.avatar,R.drawable.programmer,R.drawable.man3, R.drawable.profile, R.drawable.user2)
        val time = arrayOf("08:15 AM", "09:30 AM", "10:45 AM", "11:20 AM","08:15 AM", "12:30 PM", "03:45 PM", "10:05 AM", "06:20 PM", "09:55 PM", "01:10 PM", "04:40 PM", "11:25 AM", "07:30 PM", "02:50 PM", "05:15 PM", "08:05 AM", "09:00 PM", "12:00 AM", "06:45 AM")

        userdata = arrayListOf()
        for (index in name.indices) {
            userdata.add(UserData(name[index], message[index], image[index], time[index]))
        }

        myRecyclerView.adapter = ChatsAdapter(userdata,this)

        return view
    }
}
