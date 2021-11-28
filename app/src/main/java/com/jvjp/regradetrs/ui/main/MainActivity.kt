package com.jvjp.regradetrs.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.jvjp.regradetrs.R
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        supportActionBar!!.elevation = 0F
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame, MainFragment.newInstance())
                .commitNow()

            button_simples.setOnClickListener {
                val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
                        transaction.replace(R.id.frame, MainFragment.newInstance())
                                transaction.commit()



            }
            button_composta.setOnClickListener {
                val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.frame, CompostoFragment.newInstance())
                transaction.commit()
            }

        }


    }

}