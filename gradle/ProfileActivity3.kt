package com.example.team300

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.team300.databinding.ActivityProfile4Binding

class ProfileActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityProfile4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfile4Binding.inflate(layoutInflater).apply {
            backButton.setOnClickListener { finish() }
            githubTextView.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("https://github.com/kroeabgj")
                })
            }
            blogTextView.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("https://lionbae.tistory.com")
                })
            }

            setContentView(root)
        }

    }
}