package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ooooActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oooo2)
        supportActionBar?.hide()
    }
    fun eee(view: View) {
        val intent= Intent(this@ooooActivity2,ooooActivity::class.java)
        startActivity(intent)
    }

    fun ccc(view: View) {
        val intent=Intent(this@ooooActivity2,pionsActivity::class.java)
        startActivity(intent)
    }
}