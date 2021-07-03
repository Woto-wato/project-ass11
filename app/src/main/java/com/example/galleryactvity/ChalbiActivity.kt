package com.example.galleryactvity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChalbiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chalbi)
        var btnButton=findViewById<Button>(R.id.btnButton4)
        btnButton.setOnClickListener {
            var intent=Intent(baseContext,ChalbiActivity::class.java)
            startActivity(intent)
        }
    }
}