package com.syaira.todolist.Mulai

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.syaira.todolist.R

class ListTugas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_tugas)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val buttonKirim = findViewById<Button>(R.id.buttonKirim)

        buttonKirim.setOnClickListener {
            val name = editTextName.text.toString()
            Toast.makeText(this, "Nama: $name", Toast.LENGTH_SHORT).show()
        }
    }
}