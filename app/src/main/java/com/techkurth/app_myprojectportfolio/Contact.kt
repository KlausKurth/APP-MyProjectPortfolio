package com.techkurth.app_myprojectportfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.techkurth.app_myprojectportfolio.databinding.ActivityContactBinding
import com.techkurth.app_myprojectportfolio.databinding.ActivityMainBinding

class Contact : AppCompatActivity() {

    private lateinit var binding: ActivityContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        val toolbarContact = binding.toolbarContact
        toolbarContact.setNavigationOnClickListener {
            finish()
        }

        binding.btWhatsApp.setOnClickListener {
            openWhatsApp()
        }
    }

    private fun openWhatsApp(){

        val numeberPhone = binding.txtPhone
        val uri = Uri.parse("https://api.whatsapp.com/send?phone=$numeberPhone")

        val intent = Intent(Intent.ACTION_VIEW,uri)
        startActivity(intent)

        if (numeberPhone.equals(numeberPhone)){
            startActivity(intent)
        }else{
            val playstoreIntent = Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp"))
            startActivity(playstoreIntent)

        }

    }
}
