package com.example.team300

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.team300.databinding.ActivityProfile3Binding


class ProfileActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityProfile3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfile3Binding.inflate(layoutInflater).apply {
            backButton.setOnClickListener { finish() }
            blogTextView.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("https://lionbae.tistory.com")
                })
            }

            setContentView(root)
        }


    }
}