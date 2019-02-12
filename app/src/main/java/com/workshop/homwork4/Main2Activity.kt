package com.workshop.homwork4

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val resultText = findViewById<TextView>(R.id.tcolor)

        if (intent.extras != null) {
            val myResult = intent.getStringExtra(MainActivity.MY_RESULT_KEY)
            val message = intent.getStringExtra(MainActivity.MESSAGE_KEY)
            resultText.setText("$myResult"+"\n" +"is selected")
            resultText.setBackgroundColor(Color.parseColor(message))

        }


    }
}
