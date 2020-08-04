package com.example.stud_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnShowToast.setOnClickListener{
            Log.i("MainActivity", "Button ebat")



            Toast.makeText(this, "ButtOn", Toast.LENGTH_SHORT).show()
        }
    }
}