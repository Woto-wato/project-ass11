package com.example.galleryactvity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnButton=findViewById<Button>(R.id.btnButton1)
        btnButton.setOnClickListener {
            var intent=Intent(baseContext,EnvironmentActivity::class.java)
            startActivity(intent)
        }
    }
}