package com.example.project2.Main

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi

import com.example.project2.R
import com.example.project2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNav.setOnItemSelectedListener {
            val home=R.id.home
            val icon =R.drawable.home

            if(it.itemId==home){



                supportFragmentManager.beginTransaction()
                    .replace(R.id.container,HomeFragment())
                    .commit()

            }
            else if(it.itemId==R.id.cart){
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container,CartFragment())
                    .commit()


            }
            else if(it.itemId==R.id.setting){
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container,SettingFragment())
                    .commit()

            }



            return@setOnItemSelectedListener true

        }

    }
}