package com.example.eyeshadow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.eyeshadow.ui.MakeUpViewModel

class MainActivity : AppCompatActivity() {
    private val viewmodel: MakeUpViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}