package com.leo123nunes.motivationapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leo123nunes.motivationapp.R
import com.leo123nunes.motivationapp.infra.MotivationConstants
import com.leo123nunes.motivationapp.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_splash.*

class MainActivity : AppCompatActivity() {

    private lateinit var sharedPreferences: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences = SecurityPreferences(this)

        textName.text = sharedPreferences.getString(MotivationConstants.KEY.PERSON_NAME)
    }
}