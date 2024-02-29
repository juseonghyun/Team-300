package com.example.team300

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.team300.databinding.ActivityProfile1Binding
class ProfileActivity1 : AppCompatActivity() {

    private lateinit var binding: ActivityProfile1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfile1Binding.inflate(layoutInflater).apply {
            backButton.setOnClickListener { finish() }

            cardviewAppcompatImageView.scaleY = -1f
            linkedinImageButton.setOnClickListener {
                var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/%EC%B0%AC%EA%B5%90-%EA%B9%80-3845a42a6/"))
                startActivity(intent)
            }


            setContentView(root)
        }
    }
}