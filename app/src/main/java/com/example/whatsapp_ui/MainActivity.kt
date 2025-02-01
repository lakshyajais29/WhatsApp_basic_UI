package com.example.whatsapp_ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView: RecyclerView
    lateinit var userdata: ArrayList<UserData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.recyclerview)

        val name = arrayOf("Arjun", "Priya", "Rohan", "Ananya", "Vikram", "Kavya", "Amit", "Sanya", "Rajesh", "Meera", "Siddharth", "Pooja", "Manish", "Ishita", "Harsh", "Neha", "Varun", "Shruti", "Karan", "Deepika")
        val message = arrayOf("Hey, what's up?", "Did you reach home safely?", "Call me when you're free.", "Send me the notes, please.", "Good night!", "Are you coming tomorrow?", "Let's meet at 5 PM.", "I'll text you later.", "Where are you?", "Okay, no problem.", "Haha, that's funny!", "Did you eat?", "I'm on my way.", "Check your email.", "Sorry, I missed your call.", "Happy Birthday!", "Let me know when you're online.", "What are you doing?", "Talk to you later.", "Take care!")
        val image = arrayOf( R.drawable.user, R.drawable.user1, R.drawable.user2, R.drawable.user5, R.drawable.user6, R.drawable.user7, R.drawable.man, R.drawable.man1, R.drawable.man2, R.drawable.man3, R.drawable.programmer, R.drawable.profile, R.drawable.person, R.drawable.housekeeper, R.drawable.girl, R.drawable.bussiness, R.drawable.avatar, R.drawable.man3, R.drawable.girl, R.drawable.person)
        val time = arrayOf("08:15 AM", "09:30 AM", "10:45 AM", "11:20 AM", "12:05 PM", "01:40 PM", "02:25 PM", "03:50 PM", "04:10 PM", "05:30 PM", "06:15 PM", "07:00 PM", "08:45 PM", "09:20 PM", "10:10 PM", "11:55 PM", "12:30 AM", "01:15 AM", "02:50 AM", "04:05 AM")

        myRecyclerView.layoutManager = LinearLayoutManager(this)
        userdata = arrayListOf<UserData>()


        for (index in name.indices) {
            userdata.add(UserData(name[index], message[index], image[index], time[index]))
        }

        myRecyclerView.adapter = MyAdapter(userdata, this)
    }
}
