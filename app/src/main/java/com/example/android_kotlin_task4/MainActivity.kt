package com.example.android_kotlin_task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var team_a_score_value = 0
    private var team_b_score_value = 0
    private lateinit var teamAscore : TextView
    private lateinit var teamBscore : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val team_a_3 : Button = findViewById(R.id.team_a_3_points)
        val team_a_2 : Button = findViewById(R.id.team_a_2_points)
        val team_a_free : Button = findViewById(R.id.team_a_free_throw)
        val team_b_3 : Button = findViewById(R.id.team_b_3_points)
        val team_b_2 : Button = findViewById(R.id.team_b_2_points)
        val team_b_free : Button = findViewById(R.id.team_b_free_throw)
        teamAscore = findViewById(R.id.team_a_score)
        teamBscore = findViewById(R.id.team_b_score)
        val reset: Button = findViewById(R.id.reset)


        team_a_3.setOnClickListener {
            updateValueTeamA(3)
        }
        team_a_2.setOnClickListener {
            updateValueTeamA(2)
        }
        team_a_free.setOnClickListener {
            updateValueTeamA(1)
        }
        team_b_3.setOnClickListener {
            updateValueTeamB(3)
        }
        team_b_2.setOnClickListener {
            updateValueTeamB(2)
        }
        team_b_free.setOnClickListener {
            updateValueTeamB(1)
        }
        reset.setOnClickListener {
            team_a_score_value = 0
            team_b_score_value = 0
            updateValueTeamA(0)
            updateValueTeamB(0)
        }
    }
    private fun updateValueTeamA(n: Int) {
        team_a_score_value += n
        Log.d("myApp", "test1a")
        teamAscore.text= team_a_score_value.toString()
        Log.d("myApp", "test2a")
    }
    private fun updateValueTeamB(n: Int) {
        team_b_score_value += n
        Log.d("myApp", "test1b")
        teamBscore.text= team_b_score_value.toString()
        Log.d("myApp", "test2b")
    }
}