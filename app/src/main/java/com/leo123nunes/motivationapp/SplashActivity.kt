package com.leo123nunes.motivationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        if(supportActionBar !=null){
            supportActionBar!!.hide()
        }

        buttonSave.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if(userName.text.toString()==""){
            Toast.makeText(this,"Por gentileza, digite seu nome.",Toast.LENGTH_LONG).show()
        }else{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}