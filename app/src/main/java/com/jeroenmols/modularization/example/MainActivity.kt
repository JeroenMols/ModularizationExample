package com.jeroenmols.modularization.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import modularization.libraries.actions.Actions

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Actions.openLoginIntent(this))
    }
}
