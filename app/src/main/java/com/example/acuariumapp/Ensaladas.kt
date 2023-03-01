package com.example.acuariumapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View

class Ensaladas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ensaladas)
    }
    override fun onBackPressed() {

        startActivity(Intent(this,com.example.acuariumapp.Menu::class.java))
        super.onBackPressed()
    }

    // crear boton menu de barra superior

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_ensaladas,menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId==R.id.botonMenu_ensaladas){
            startActivity(Intent(this,com.example.acuariumapp.Menu::class.java))
            finish()
        }

        return super.onOptionsItemSelected(item)
    }
}