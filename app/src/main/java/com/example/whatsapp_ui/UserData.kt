package com.example.whatsapp_ui

data class UserData(
    var name: String,
    var message: String? = null,  // Used for Chats (nullable for Calls/Status)
    var image: Int,
    var time: String? = null,     // Used for Chats & Status (nullable for Calls)
    var callType: Int? = null     // Used only for Calls (nullable for Chats/Status)
)
