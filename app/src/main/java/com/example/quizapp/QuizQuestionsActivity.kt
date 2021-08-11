package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {

    val progressBar = findViewById<ProgressBar>(R.id.progressBar)
    val tv_progress = findViewById<TextView>(R.id.tv_progress)
    val tv_question = findViewById<TextView>(R.id.tv_question)
    val iv_image = findViewById<ImageView>(R.id.iv_image)
    val tv_option_one = findViewById<TextView>(R.id.tv_option_one)
    val tv_option_two = findViewById<TextView>(R.id.tv_option_two)
    val tv_option_three = findViewById<TextView>(R.id.tv_option_three)
    val tv_option_four = findViewById<TextView>(R.id.tv_option_four)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionsList = Constants.getQuestions()
        Log.i( "Questions Size", "${questionsList.size }")


        val currentPosition = 1
        val question: Question? = questionsList[currentPosition - 1]


        progressBar.progress = currentPosition
        tv_progress.text = "$currentPosition" + "/" + progressBar.max

        tv_question.text = question!!.quesion
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour


    }




}