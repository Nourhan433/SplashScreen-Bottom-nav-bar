package com.example.project2.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.project2.Main.MainActivity
import com.example.project2.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        startHomeScreen()

    }

    private fun startHomeScreen() {
       Handler(Looper.getMainLooper()).postDelayed({
           val intent=Intent(this, MainActivity::class.java)
           startActivity(intent)},2000)
       }



}