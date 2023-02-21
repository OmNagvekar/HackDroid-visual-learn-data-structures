package com.gmail.hackdroid.visual.learn.data.structure

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

class LoginActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val mail : EditText = findViewById(R.id.myEditTextMail)
        val pass: EditText = findViewById(R.id.myEditTextPassword)

        val btnLogin : CardView = findViewById(R.id.btn_login)
        val btnContinue : CardView = findViewById(R.id.btn_Continue)

        val createAccount : TextView = findViewById(R.id.tv_create_account)

        btnLogin.setOnClickListener {

            if(mail.text.toString() == "abc" && pass.text.toString() == "123" ) {
                startActivity(Intent(this,HomeActivity::class.java))
                finish()
            }
            else {
                Toast.makeText(this,"Continue with Google ",Toast.LENGTH_LONG).show()
            }

        }

        btnContinue.setOnClickListener {
            Toast.makeText(this,"Continue with Google ",Toast.LENGTH_LONG).show()
        }

        createAccount.setOnClickListener {
            startActivity(Intent(this,RegistrationActivity::class.java))
            finish()
        }

    }


}