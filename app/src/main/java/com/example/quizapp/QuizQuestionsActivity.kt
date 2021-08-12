package com.example.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition : Int = 1
    private var mQuestionsList : ArrayList<Question>? = null
    private var mSelectedOptionPosition : Int = 0


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

        mQuestionsList = Constants.getQuestions()
        setQuestion()

    }

    private fun setQuestion(){
        mCurrentPosition = 1
        val question = mQuestionsList!![mCurrentPosition - 1]

        defaultOptionsView()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        tv_question.text = question!!.quesion
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour


    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3,tv_option_four)


        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    override fun onClick(v: View?)
    {
        when(v?.id)
        {
            R.id.tv_option_one ->
            {
                selectedOptionView(tv_option_one, 1)
            }
            R.id.tv_option_two ->
            {
                selectedOptionView(tv_option_two, 2)
            }
            R.id.tv_option_three ->
            {
                selectedOptionView(tv_option_three, 3)
            }
            R.id.tv_option_four ->
            {
                selectedOptionView(tv_option_four, 4)
            }
        }
    }

    private fun selectedOptionView(tv: TextView,
                                   selectedOptionNum: Int)
    {
     defaultOptionsView()
     mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )

    }


}