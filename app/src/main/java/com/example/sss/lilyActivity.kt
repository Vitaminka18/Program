package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class lilyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lily)
        supportActionBar?.hide()

    }

    fun gfg(view: View) {
        val intent=Intent(this@lilyActivity,mimosaActivity::class.java)
        startActivity(intent)
    }
}