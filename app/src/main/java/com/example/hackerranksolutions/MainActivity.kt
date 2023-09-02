package com.example.hackerranksolutions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hackerranksolutions.preparationkit.day2.lonelyinteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arr=arrayOf(1,2,3,4,3,2,1)
        val result= lonelyinteger(arr)
        println(result)
    }
}