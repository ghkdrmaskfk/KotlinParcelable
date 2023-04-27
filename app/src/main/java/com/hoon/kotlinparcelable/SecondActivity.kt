package com.hoon.kotlinparcelable

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Build.VERSION.SDK_INT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.service.autofill.UserData
import com.hoon.kotlinparcelable.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userData = if (SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("user", User::class.java)
        } else intent.getParcelableExtra("user")

        binding.userData = userData
    }

    companion object {
        fun getIntent(context: Context, user: User): Intent {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("user", user)
            return intent
        }
    }
}