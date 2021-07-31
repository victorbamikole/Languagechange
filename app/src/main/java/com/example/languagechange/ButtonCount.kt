package com.example.languagechange

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_button_count.*

class ButtonCount : AppCompatActivity() {
    var counter = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_count)

        savedInstanceState?.let {
            counter = it.getInt("count")
        }


        val but1 = findViewById<Button>(R.id.button5)
        val counts = findViewById<TextView>(R.id.count)
        counts.text = counter.toString()
        but1.setOnClickListener{
                counter++
                counts.text =  counter.toString()
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("count", counter)
    }
}




