package com.workshop.homwork4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    companion object {
        const val MY_RESULT_KEY = "RESULT"
        const val MESSAGE_KEY = "MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRed=findViewById<Button>(R.id.btred)
        val buttonGreen=findViewById<Button>(R.id.btgreen)
        val buttonOrange=findViewById<Button>(R.id.btorange)
        val buttonPurple=findViewById<Button>(R.id.btpurple)
        val buttonYellow=findViewById<Button>(R.id.btyellow)
        val buttonBlue=findViewById<Button>(R.id.btblue)

        buttonRed.setOnClickListener{
            val result=buttonRed.text.toString()
            val btcolor="#ff0000"
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra(MY_RESULT_KEY, result)
            intent.putExtra(MESSAGE_KEY,btcolor)
            startActivity(intent)

        }
        buttonGreen.setOnClickListener {
            val result=buttonGreen.text.toString()
            val btcolor="#008000"
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra(MY_RESULT_KEY, result)
            intent.putExtra(MESSAGE_KEY,btcolor)
            startActivity(intent)
        }
        buttonOrange.setOnClickListener {
            val result=buttonOrange.text.toString()
            val btcolor="#ffa500"
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra(MY_RESULT_KEY, result)
            intent.putExtra(MESSAGE_KEY,btcolor)
            startActivity(intent)

        }
        buttonPurple.setOnClickListener {
            val result=buttonPurple.text.toString()
            val btcolor="#a020f0"
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra(MY_RESULT_KEY, result)
            intent.putExtra(MESSAGE_KEY,btcolor)
            startActivity(intent)

        }
        buttonYellow.setOnClickListener {
            val result=buttonYellow.text.toString()
            val btcolor="#ffff00"
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra(MY_RESULT_KEY, result)
            intent.putExtra(MESSAGE_KEY,btcolor)
            startActivity(intent)

        }
        buttonBlue.setOnClickListener {
            val result=buttonBlue.text.toString()
            val btcolor="#0000ff"
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra(MY_RESULT_KEY, result)
            intent.putExtra(MESSAGE_KEY,btcolor)
            startActivity(intent)

        }
    }

}
