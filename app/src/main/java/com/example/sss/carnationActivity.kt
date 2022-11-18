package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class carnationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carnation)
        supportActionBar?.hide()
    }

    fun qqq(view: View) {
        val intent = Intent(this@carnationActivity,irisActivity::class.java)
        startActivity(intent)
    }
}