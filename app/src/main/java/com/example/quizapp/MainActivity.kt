package com.example.quizapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import java.time.Clock.system
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

@Suppress("DEPRECATION")

class MainActivity : AppCompatActivity() {

    val btn_start = findViewById<Button>(R.id.btn_start)
    val et_name = findViewById<EditText>(R.id.et_name)

    @RequiresApi(Build.VERSION_CODES.HONEYCOMB)
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        btn_start.setOnClickListener()
        {

            if (et_name.text.toString().isEmpty())
            {
                Toast.makeText(this,
                    "Please enter your name",
                    Toast.LENGTH_SHORT).show()
            }else
            {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}