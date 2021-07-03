package com.example.galleryactvity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EnvironmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_environment)
        var btnButton=findViewById<Button>(R.id.btnButton2)
        btnButton.setOnClickListener {
            var intent=Intent(baseContext,AnimalActivity::class.java)
            startActivity(intent)
        }
    }
}