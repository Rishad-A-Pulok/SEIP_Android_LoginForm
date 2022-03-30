package com.example.loginform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class HomeActivity : AppCompatActivity() {
    private lateinit var msgTV: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        msgTV = findViewById(R.id.msgTV)
        val email = intent.getStringExtra("email")
        msgTV.text = "Welcome, $email"
    }
}