package com.example.task_1_androfund_austin_b_morning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class input_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_page)

        val name: EditText = findViewById(R.id.name)
        val age: EditText = findViewById(R.id.age)
        val email: EditText = findViewById(R.id.email)
        val button: Button = findViewById(R.id.save)

        button.setOnClickListener {
            val intent = Intent(this, output_page::class.java)
            intent.putExtra("name", name.text.toString())
            intent.putExtra("age", age.text.toString())
            intent.putExtra("email", email.text.toString())
            startActivity(intent)
        }
    }
}