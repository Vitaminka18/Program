package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ghActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gh)
        supportActionBar?.hide()
    }

    fun ssdd(view: View) {
        val intent= Intent(this@ghActivity,vbActivity::class.java)
        startActivity(intent)
    }
}