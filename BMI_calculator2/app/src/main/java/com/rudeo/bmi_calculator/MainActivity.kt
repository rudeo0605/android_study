package com.rudeo.bmi_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.rudeo.bmi_calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }



    fun calculator(view: android.view.View) {

        val heightEditText : EditText = findViewById(R.id.heightEditText)
        val weightEditText : EditText = findViewById(R.id.weightEditText)


        val height : Int = heightEditText.text.toString().toInt()
        val weight : Int = weightEditText.text.toString().toInt()

        val intent = Intent(view.context, ResultActivity::class.java)

        intent.putExtra("height",height)
        intent.putExtra("weight", weight)
        startActivity(intent)
    }


}