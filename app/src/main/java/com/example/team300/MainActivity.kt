package com.example.team300

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.scaleMatrix
import com.example.team300.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // 뷰바인딩 관련 로직
    private var mainBinding: ActivityMainBinding? = null
    private val binding get() = mainBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // 뷰바인딩 관련 로직
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.iv1.setOnClickListener {
            val intent = Intent(this, ProfileActivity1::class.java)
            startActivity(intent)



        }

        binding.iv2.setOnClickListener{
            val intent = Intent(this, ProfileActivity2::class.java)
            startActivity(intent)

        }

        binding.iv3.setOnClickListener {
            val intent = Intent(this, ProfileActivity3::class.java)
            startActivity(intent)

        }

        binding.iv4.setOnClickListener {
            val intent = Intent(this, ProfileActivity4::class.java)
            startActivity(intent)

        }



    }
}