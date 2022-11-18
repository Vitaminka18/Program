package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class flowerrActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flowerr)
        supportActionBar?.hide()
    }

    fun vvv(view: View) {
        val intent=Intent(this@flowerrActivity,bouquetActivity::class.java)
        startActivity(intent)
    }

    fun ddf(view: View) {
        val intent=Intent(this@flowerrActivity,lilysActivity::class.java)
        startActivity(intent)
    }
}