package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class mimosaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mimosa)
        supportActionBar?.hide()
    }

    fun tgb(view: View) {
        val intent=Intent(this@mimosaActivity,bellActivity::class.java)
        startActivity(intent)
    }
}