package com.example.task_1_androfund_austin_b_morning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class output_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output_page)

        val data1 = intent.getStringExtra("name")
        val data2 = intent.getStringExtra("age")
        val data3 = intent.getStringExtra("email")

        if (savedInstanceState == null) {
            val bundle = Bundle()
            bundle.putString("name", data1)
            bundle.putString("age", data2)
            bundle.putString("email", data3)

            val fragment = output()
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, fragment)
                commit()
            }
        }
    }
}