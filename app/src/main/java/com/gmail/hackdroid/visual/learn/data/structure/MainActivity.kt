package com.gmail.hackdroid.visual.learn.data.structure

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var logo : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logo=findViewById(R.id.myLogo)

        logo.alpha = 0f

        logo.animate().apply {
            duration = 2000
            alpha(1f)
        }.withEndAction{
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }

    }


}