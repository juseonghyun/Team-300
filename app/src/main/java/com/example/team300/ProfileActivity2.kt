package com.example.team300

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.team300.databinding.ActivityProfile2Binding

class ProfileActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityProfile2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfile2Binding.inflate(layoutInflater).apply {
            btnBack2.setOnClickListener { finish() }

            tvGithub2.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("https://github.com/juseonghyun")
                })
            }

            tvTistory2.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("https://jucodingdev.tistory.com/")
                })
            }

            ivSeonghyun.setOnClickListener {
                Toast.makeText(applicationContext, "찢어진 주성현...", Toast.LENGTH_SHORT).show()
            }

            setContentView(root)
        }
    }
}