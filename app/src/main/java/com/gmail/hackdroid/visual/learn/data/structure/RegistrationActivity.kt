package com.gmail.hackdroid.visual.learn.data.structure

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.cardview.widget.CardView

class RegistrationActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val mail : EditText = findViewById(R.id.myEditTextMail)
        val name : EditText = findViewById(R.id.myEditTextName)
        val pass : EditText = findViewById(R.id.myEditTextPassword)


        val btnCreate : CardView = findViewById(R.id.btn_create)
        val btnContinue : CardView = findViewById(R.id.btn_Continue)


        btnCreate.setOnClickListener {

            if(mail.toString().isEmpty() && name.toString().isEmpty() && pass.toString().isEmpty()) {
                Toast.makeText(this,"Enter Your Details ",Toast.LENGTH_LONG).show()
            }
            else {
                val userName = name.toString()
                val userMail = mail.toString()
                val userPass = pass.toString()

                Toast.makeText(this," userName: $userName  userMail: $userMail userPass: $userPass",Toast.LENGTH_LONG).show()

                startActivity(Intent(this,HomeActivity::class.java))
                finish()
            }

        }

        btnContinue.setOnClickListener {
            Toast.makeText(this,"Google Continue",Toast.LENGTH_LONG).show()
        }

    }



}