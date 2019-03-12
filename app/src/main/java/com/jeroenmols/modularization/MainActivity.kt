package com.jeroenmols.modularization

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import modularization.libraries.actions.Actions
import modularization.login.LoginActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Actions.openLoginIntent())
    }
}
