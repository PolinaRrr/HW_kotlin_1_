package com.example.hw_kotlin_1_20022021

import android.graphics.Color.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colors = listOf(RED, GREEN, BLUE, YELLOW, CYAN, MAGENTA, WHITE)
        // todo через резурсы
        val texts = listOf<String>(
            "PUSH!",
            "Puush!",
            "PUSH ME!",
            "Puush me!",
            "LOL!Push me",
            "ROFL!Push",
            "PUSH!!!",
            "PuSh Me!",
            "PUpuPush!",
            "Push now!"
        )

        // todo использование размеров экрана для изменения расположения кнопки
        /*
        val displayMetrics = DisplayMetrics()
        var width = displayMetrics.widthPixels
        var height = displayMetrics.heightPixels*/

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            button.text = texts.random()
            button.setBackgroundColor(colors.random())

            // todo изменение расположения кнопки
            /*button.layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT)*/
        }
    }
}