package com.algebra.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomappbar.BottomAppBar

class MainActivity : AppCompatActivity() {

    //TODO: add source and targets compile options to build.gradle
    /*
     compileOptions {
        sourceCompatibility 1.8
        targetCompatibility 1.8
    }
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomBar: BottomAppBar = findViewById(R.id.bar)
        setSupportActionBar(bottomBar)

        bottomBar.setNavigationOnClickListener {
            Toast.makeText(this@MainActivity,"Home Clicked", Toast.LENGTH_LONG).show()
        }

        bottomBar.setOnMenuItemClickListener { item ->
            when(item.itemId) {
                R.id.miEdit -> Toast.makeText(this@MainActivity,"Edit Clicked", Toast.LENGTH_LONG).show()
                R.id.miHome -> Toast.makeText(this@MainActivity,"Home Clicked", Toast.LENGTH_LONG).show()
            }
            false
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }
}