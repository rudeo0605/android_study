package com.rudeo.bmi_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val intent = intent

        var bmiTextView = findViewById<TextView>(R.id.bmiText)
        var bmiResultTextView = findViewById<TextView>(R.id.bmiResultText)

        val weight : Int = intent.getIntExtra("weight",0)
        val height : Int = intent.getIntExtra("height",0)

        val bmiValue = weight / ((height / 100f) * (height / 100f))

        val resultText = when
        {
            bmiValue < 18.5 -> "저체중"
            bmiValue < 23 -> "정상체중"
            bmiValue < 25 -> "과체중"
            bmiValue < 30 -> "경도 비만"
            bmiValue < 35 -> "중정도 비만"

            else -> "고도 비만"
        }

        bmiTextView.text = "당신의 bmi수치는 " + bmiValue.toString() + "입니다."
        bmiResultTextView.text = "당신은 " + resultText + "입니다"
        val toast = Toast.makeText(this, resultText, Toast.LENGTH_SHORT)
        toast.show()
    }
}


