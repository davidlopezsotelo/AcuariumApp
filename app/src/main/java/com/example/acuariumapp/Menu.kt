package com.example.acuariumapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun raciones(vista: View){
        val i= Intent(this,Raciones::class.java)
        startActivity(i)
        finish()
    }

    fun bocatas(vista: View){
        val i=Intent(this,Bocatas::class.java)
        startActivity(i)
        finish()
    }

    fun burgers(vista: View){
        val i=Intent(this,Burguers::class.java)
        startActivity(i)
        finish()
    }
    fun sandwich(vista: View){
        val i=Intent(this,Sandwich::class.java)
        startActivity(i)
        finish()
    }
    fun ensaladas(vista: View){
        val i=Intent(this,Ensaladas::class.java)
        startActivity(i)
        finish()
    }
    fun platos(vista: View){
        val i=Intent(this,Platos::class.java)
        startActivity(i)
        finish()
    }
    fun postres(vista: View){
        val i=Intent(this,Postres::class.java)
        startActivity(i)
        finish()
    }
    fun salir(vista:View?){


        val myToast=Toast.makeText(this,"Hasta la vista, baby....",Toast.LENGTH_LONG)
        myToast.setGravity(Gravity.CENTER,0,0)
        myToast.show()


      finish()

       /* fun myToast (contexto: Context,mensaje:String){

            val myToast=Toast.makeText(this,"Hasta la vista, baby....",Toast.LENGTH_LONG)
            myToast.setGravity(Gravity.CENTER,0,0)
            myToast.show()
        }*/





    }
}