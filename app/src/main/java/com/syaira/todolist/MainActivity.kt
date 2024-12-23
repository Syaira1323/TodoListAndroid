package com.syaira.todolist

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.syaira.todolist.Mulai.ListKegiatan

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val buttonMulai = findViewById<Button>(R.id.button_Mulai)
        buttonMulai.setOnClickListener {
            val intent = Intent(this, ListKegiatan::class.java)
            startActivity(intent)
        }
        val buttonGoogle = findViewById<Button>(R.id.button_Google)
        buttonGoogle.setOnClickListener {
            val intent = Intent(this, Google::class.java)
            startActivity(intent)
        }

    }
}