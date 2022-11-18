package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class irisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iris)
        supportActionBar?.hide()
    }

    fun qaz(view: View) {
        val intent=Intent(this@irisActivity,narcissistActivity::class.java)
        startActivity(intent)
    }
}