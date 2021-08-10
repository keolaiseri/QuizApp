package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {

        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "America",
            "Australia",
            "Armenia",
            "Austria",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas",
            "Brazil",
            "Britain",
            "Belgium",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Jamaica",
            "Banana",
            "Brazil",
            "Belgium",
            3
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Iraq",
            "Denmark",
            "Tonga",
            "Mexico",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji",
            "Tahiti",
            "Scotland",
            "Italy",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "France",
            "Switzerland",
            "Brazil",
            "Germany",
            4
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India",
            "Ireland",
            "China",
            "Thailand",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Saudi Arabia",
            "Kuwait",
            "Somalia",
            "Nigeria",
            2
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia",
            "Great Britain",
            "Ireland",
            "New Zealand",
            4
        )
        questionsList.add(que10)

        return questionsList
    }



}