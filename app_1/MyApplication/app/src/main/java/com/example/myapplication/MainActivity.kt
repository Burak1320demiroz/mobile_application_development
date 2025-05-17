package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // EditText ve Button'ları buluyoruz
        val etNumber1 = findViewById<EditText>(R.id.etNumber1)
        val etNumber2 = findViewById<EditText>(R.id.etNumber2)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        // Hesaplama işlemi
        btnCalculate.setOnClickListener {
            // EditText'lerden girilen değerleri alıyoruz
            val num1 = etNumber1.text.toString().toIntOrNull()
            val num2 = etNumber2.text.toString().toIntOrNull()

            // Girilen değerler geçerliyse işlem yapıyoruz
            if (num1 != null && num2 != null) {
                val result = num1 * num2
                tvResult.text = "Sonuç: $result"
            } else {
                tvResult.text = "Lütfen geçerli sayılar girin."
            }
        }
    }
}
