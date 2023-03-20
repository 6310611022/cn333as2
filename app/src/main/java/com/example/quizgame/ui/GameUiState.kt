package com.example.quizgame.ui

import com.example.quizgame.ui.Question

data class GameUiState(
    val useQuestion: Question = Question("", listOf("", "", "", ""), ""),
    val numQue: Int = 1,
    val score: Int = 0,
    val isGameOver: Boolean = false
)