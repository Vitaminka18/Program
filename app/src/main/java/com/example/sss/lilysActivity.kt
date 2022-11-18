package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class lilysActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lilys)
        supportActionBar?.hide()
    }

    fun sdd(view: View) {
        val intent= Intent(this@lilysActivity,flowersActivity::class.java)
        startActivity(intent)
    }

    fun ef(view: View) {
        val intent=Intent(this@lilysActivity,ooooActivity2::class.java)
        startActivity(intent)
    }
}