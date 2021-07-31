package com.example.languagechange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {
    var counter = 0


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_count)

        val but1 = findViewById<Button>(R.id.button5)
        val counts = findViewById<TextView>(R.id.count)
        counts.text = counter.toString()
        but1.setOnClickListener{
            counter++
            counts.text =  counter.toString()
            Snackbar.make(but1, counter.toString(), Snackbar.LENGTH_LONG).show()
        }

    }
}