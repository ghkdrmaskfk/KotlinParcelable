package com.hoon.kotlinparcelable

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hoon.kotlinparcelable.databinding.ActivityMainBinding
import com.hoon.kotlinparcelable.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startActivity(
            SecondActivity.getIntent(
                this, User("Lee", "Sang", 29)
            )
        )
    }
}