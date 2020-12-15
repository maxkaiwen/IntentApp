package com.example.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.activity2.*

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello world")
        infoToastWithFont.setOnClickListener(View.OnClickListener {
           // Toast.makeText(applicationContext, "this is toast message", Toast.LENGTH_LONG).show()
            intent = Intent(applicationContext, SecondActivity::class.java)
            intent.putExtra("id_value", 5)
            intent.putExtra("language_value", "Max")
            startActivity(intent)
        })

    }
}