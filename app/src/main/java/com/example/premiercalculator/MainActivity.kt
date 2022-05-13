package com.example.premiercalculator

import android.graphics.Insets.subtract
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var  etNumber1: EditText
    lateinit var  etNumber2: EditText
    lateinit var  btnAdd: Button
    lateinit var  btnSubtract: Button
    lateinit var  btnMultiply: Button
    lateinit var  btnDivide: Button
    lateinit var  tvAnswer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNumber1=findViewById(R.id.etNumber1)
        etNumber2 =findViewById(R.id.etNumber2)
        btnAdd=findViewById(R.id. btnAdd)
        btnSubtract =findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id. btnMultiply)
        btnDivide=findViewById(R.id.btnDivide)
        tvAnswer =findViewById(R.id.tvAnswer)


        btnAdd.setOnClickListener {
            var num1 =etNumber1.text.toString().toDouble()
            var num2 =etNumber2.text.toString().toDouble()
            add(num1,num2)
        }
        btnSubtract.setOnClickListener {
            var num1 =etNumber1.text.toString().toDouble()
            var num2 =etNumber2.text.toString().toDouble()
            subtract(num1, num2)
        }
        btnMultiply.setOnClickListener {
            var num1 =etNumber1.text.toString().toDouble()
            var num2 =etNumber2.text.toString().toDouble()
            multiply(num1,num2)
        }
        btnDivide.setOnClickListener {
            var num1 =etNumber1.text.toString().toDouble()
            var num2 =etNumber2.text.toString().toDouble()
            modulus(num1,num2)
        }


    }

    fun modulus(num1: Double, num2: Double) {
        var mod =num1%num2
        tvAnswer.text=mod.toString()

    }

    fun multiply(num1: Double,num2: Double) {
        var multi = num1*num2
        tvAnswer.text=multi.toString()

    }

    fun subtract(num1: Double, num2: Double) {

     var difference=num1-num2
     tvAnswer.text =difference.toString()
    }

    fun add(num1:Double,num2:Double){
            var total=num1+num2
            tvAnswer.text = total.toString()

        }


}
