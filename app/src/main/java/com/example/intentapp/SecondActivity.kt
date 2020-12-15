package com.example.intentapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity2.*
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)
        val bundle: Bundle = intent.extras!!
        val id = bundle.get("id_value")
        val language = bundle.get("language_value")
        println("$id $language")
        //Toast.makeText(SecondActivity.,"Hi",Toast.LENGTH_LONG).show()
        Toast.makeText(this, "HI", Toast.LENGTH_SHORT).show()

        button1.setOnClickListener(View.OnClickListener {

            Toast.makeText(applicationContext,"Hi",Toast.LENGTH_LONG).show()
        })


        infoToastWithFont2.setOnClickListener(View.OnClickListener {
            //   Toast.makeText(applicationContext,"this is toast message", Toast.LENGTH_LONG).show()
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        })
    }
}