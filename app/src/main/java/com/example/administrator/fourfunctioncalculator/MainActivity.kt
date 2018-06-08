package com.example.administrator.fourfunctioncalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btnAdd) as Button
        val btn2 = findViewById<Button>(R.id.btnSubtract) as Button
        val btn3 = findViewById<Button>(R.id.btnMultiply) as Button
        val btn4 = findViewById<Button>(R.id.btnDivide) as Button

        /*var num1: Int = Integer.parseInt(numOne.getText().toString())
        var num2: Int = Integer.parseInt(numTwo.getText().toString())
        var total = 0

        btn1.setOnClickListener {
            total = num2 + num1
            lblDisplayResult.setText(total)
        }

        btn2.setOnClickListener {
            total = num2 - num1
            lblDisplayResult.setText(total)
        }

        btn3.setOnClickListener {
            total = num2 * num1
            lblDisplayResult.setText(total)
        }

        btn4.setOnClickListener {
            total = num2 / num1
            lblDisplayResult.setText(total)
        }
    }*/

        btn1.setOnClickListener {
            val result: Int = numTwo.text.toString().toInt() + numOne.text.toString().toInt()
            lblDisplayResult.text = result.toString()
        }

        btn2.setOnClickListener {
            val result: Int = numTwo.text.toString().toInt() - numOne.text.toString().toInt()
            lblDisplayResult.text = result.toString()
        }

        btn3.setOnClickListener {
            val result: Int = numTwo.text.toString().toInt() * numOne.text.toString().toInt()
            lblDisplayResult.text = result.toString()
        }

        btn4.setOnClickListener {
            val result: Int = numTwo.text.toString().toInt() / numOne.text.toString().toInt()
            lblDisplayResult.text = result.toString()
        }
    }
}
