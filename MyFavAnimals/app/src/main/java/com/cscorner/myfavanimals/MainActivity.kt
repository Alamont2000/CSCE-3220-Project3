package com.cscorner.myfavanimals

import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainImage)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toolbar: Toolbar = findViewById(R.id.mytoolbar)
        setSupportActionBar(toolbar)

    }
    fun foxButton(view: View?){
        println("Foggs")

        val imgV: ImageView = findViewById(R.id.currentanimal)

        imgV.alpha = 0.0f
        imgV.animate().apply{
            interpolator = LinearInterpolator()
            duration = 2000
            alpha(1f)
            start()
        }

        imgV.setImageResource(R.drawable.stonedfox)
    }

    fun possButton(view: View?){
        println("Poss")

        val imgV: ImageView = findViewById(R.id.currentanimal)

        imgV.alpha = 0.0f
        imgV.animate().apply{
            interpolator = LinearInterpolator()
            duration = 2000
            alpha(1f)
            start()
        }

        imgV.setImageResource(R.drawable.opossum)
    }

    fun manedButton(view: View?){
        println("Leggy")

        val imgV: ImageView = findViewById(R.id.currentanimal)

        imgV.alpha = 0.0f
        imgV.animate().apply{
            interpolator = LinearInterpolator()
            duration = 2000
            alpha(1f)
            start()
        }

        imgV.setImageResource(R.drawable.manedwolf)
    }
}

