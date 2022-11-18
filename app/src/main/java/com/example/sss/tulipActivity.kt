package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class tulipActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tulip)
        supportActionBar?.hide()
    }

    fun xr(view: View) {
         val intent=Intent(this@tulipActivity,astraActivity::class.java)
        startActivity(intent)

    }
}