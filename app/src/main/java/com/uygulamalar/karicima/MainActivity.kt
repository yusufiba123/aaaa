package com.uygulamalar.karicima

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun bas(view: View){
        val intent= Intent(applicationContext,Main2Activity::class.java)
        startActivity(intent)

    }
}
