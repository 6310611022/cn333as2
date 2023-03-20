package com.example.quizgame.ui

data class Question (
    val question: String,
    var choice: List<String>,
    val answer: String
)