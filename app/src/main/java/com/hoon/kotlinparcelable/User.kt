package com.hoon.kotlinparcelable

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parceler
import kotlinx.parcelize.Parcelize

/**
https://developer.android.com/kotlin/parcelize?hl=ko
 **/
@Parcelize
data class User(val firstName: String, val lastName: String, val age: Int): Parcelable

//@Parcelize
//data class User(val firstName: String, val lastName: String, val age: Int) : Parcelable {
//    private companion object : Parceler<User> {
//        override fun User.write(parcel: Parcel, flags: Int) {
//            // Custom write implementation
//        }
//
//        override fun create(parcel: Parcel): User {
//            // Custom read implementation
//        }
//    }
//}