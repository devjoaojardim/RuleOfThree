package com.jvjp.regradetrs.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.jvjp.regradetrs.ui.main.MainActivity
import com.jvjp.regradetrs.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
       if(supportActionBar != null){
           supportActionBar!!.hide()
       }

        val handle = Handler()
        handle.postDelayed(Runnable {
            run {
                mostrarConteudo()
            }
        }, 1800)

    }

    fun mostrarConteudo() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

    }
}


