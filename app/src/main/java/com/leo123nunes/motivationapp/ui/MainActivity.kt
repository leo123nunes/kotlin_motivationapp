package com.leo123nunes.motivationapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.leo123nunes.motivationapp.R
import com.leo123nunes.motivationapp.infra.MotivationConstants
import com.leo123nunes.motivationapp.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_splash.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var sharedPreferences: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences = SecurityPreferences(this)

        if(supportActionBar!=null){
            supportActionBar!!.hide()
        }

        textName.text = sharedPreferences.getString(MotivationConstants.KEY.PERSON_NAME)

        imageAll.setOnClickListener(this)
        imageHappy.setOnClickListener(this)
        imageMorning.setOnClickListener(this)
        buttonNewPhrase.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        var v = view.id

        var list = listOf(R.id.imageAll, R.id.imageHappy, R.id.imageMorning)

        if(v == R.id.buttonNewPhrase){

        }else if(v in list){
            handleFilter(v)
        }
    }

    private fun handleFilter(id: Int){
        imageAll.setColorFilter(resources.getColor(R.color.colorAccent))
        imageHappy.setColorFilter(resources.getColor(R.color.colorAccent))
        imageMorning.setColorFilter(resources.getColor(R.color.colorAccent))

        when(id){
            R.id.imageAll -> {imageAll.setColorFilter(resources.getColor(R.color.filterColor))}
            R.id.imageHappy -> {imageHappy.setColorFilter(resources.getColor(R.color.filterColor))}
            R.id.imageMorning -> {imageMorning.setColorFilter(resources.getColor(R.color.filterColor))}
        }
    }
}