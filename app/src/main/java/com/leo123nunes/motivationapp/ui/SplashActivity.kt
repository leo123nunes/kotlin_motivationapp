package com.leo123nunes.motivationapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.leo123nunes.motivationapp.R
import com.leo123nunes.motivationapp.infra.MotivationConstants
import com.leo123nunes.motivationapp.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var sharedPreferences: SecurityPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        sharedPreferences = SecurityPreferences(this)

        if(supportActionBar !=null){
            supportActionBar!!.hide()
        }

        buttonSave.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        var v = view.id
        if(v==R.id.buttonSave){
            handleSave()
        }
    }

    private fun handleSave(){
        var name = userName.text.toString()

        if(name==""){
            Toast.makeText(this
                ,"Por gentileza, digite seu nome.",Toast.LENGTH_LONG).show()
        }else{
            sharedPreferences.storeString(MotivationConstants.KEY.PERSON_NAME,name)
            startActivity(Intent(this,
                MainActivity::class.java))
        }
    }
}