package com.example.languagechange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button?.setOnClickListener{
            textView.text= "Bonjour Victor.".toUpperCase()
        }

        button2?.setOnClickListener{
            textView.text= "Hola Victor.".toUpperCase()
        }

        button3?.setOnClickListener{
            textView.text= "Hello Victor.".toUpperCase()
        }

        }
    }
