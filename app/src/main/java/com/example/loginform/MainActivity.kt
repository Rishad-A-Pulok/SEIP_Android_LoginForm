package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var emailET: EditText
    private lateinit var passET: EditText
    private lateinit var loginBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        emailET = findViewById(R.id.mailInputET)
        passET = findViewById(R.id.passInputET)
        loginBtn = findViewById(R.id.loginBtn)
        loginBtn.setOnClickListener {
            val email = emailET.text.toString()
            val password = passET.text.toString()
            if(email.isEmpty()){
                emailET.error = "This field must not be empty!"
                return@setOnClickListener
            }
            if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                emailET.error = "Invalid email address!"
                return@setOnClickListener
            }
            if(password.isEmpty()){
                passET.error = "This field must not be empty!"
                return@setOnClickListener
            }

            val intent = Intent(this, HomeActivity::class.java)       //Explicit intent
            intent.putExtra("email",email)

            startActivity(intent)

        }
    }

}