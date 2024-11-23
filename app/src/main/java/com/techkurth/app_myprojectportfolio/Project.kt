package com.techkurth.app_myprojectportfolio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.techkurth.app_myprojectportfolio.databinding.ActivityContactBinding
import com.techkurth.app_myprojectportfolio.databinding.ActivityProjectBinding

class Project : AppCompatActivity() {

    private lateinit var binding: ActivityProjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toolbarProject = binding.toolbarProject
        toolbarProject.setNavigationOnClickListener {
            finish()
        }


    }
}