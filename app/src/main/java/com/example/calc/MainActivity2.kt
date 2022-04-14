package com.example.calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Exit_But = findViewById<Button>(R.id.button28)
        val TExting = findViewById<TextInputEditText>(R.id.texting)
        val funk=intent.getStringExtra("Function")
        if(funk=="sin"){
            TExting.setText("Синус острого угла в прямоугольном треугольнике — это отношение противолежащего катета к гипотенузе.")
        }else if(funk=="cos"){
            TExting.setText("Косинус острого угла в прямоугольном треугольнике — отношение прилежащего катета к гипотенузе.")
        }else if(funk=="tan"){
            TExting.setText("Тангенс острого угла в прямоугольном треугольнике — отношение противолежащего катета к прилежащему.")
        }else if(funk=="ctg"){
            TExting.setText("Котангенс острого угла в прямоугольном треугольнике — отношение прилежащего катета к противолежащему.")
        }else{
            TExting.setText("Что-то пошло не так.")

        }

        //text
        Exit_But.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}