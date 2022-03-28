package com.tym.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var tv_result:TextView
    private lateinit var et_input1:EditText
    private lateinit var et_input2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        tv_result = findViewById(R.id.tv_result)
        et_input1 = findViewById(R.id.et_input1)
        et_input2 = findViewById(R.id.et_input2)

      button.setOnClickListener {
          val num1:Int=et_input1.text.toString().toInt()
          val num2:Int=et_input2.text.toString().toInt()
          val start:Int=if(num2<0) num2 else 1
          val end:Int=if(num2<0) -1 else num2
          var output="  "
          if(num2==0){
              output="$num1*0=0"
          }else{
              for(index in start..end){
                  output+="$num1*$index=${num1*index}"
              }
          }
          tv_result.text=output
      }
    }
}