package com.leo123nunes.motivationapp.infra

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences(context: Context){
    private var sharedPreferences = context.getSharedPreferences("motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, valor: String){
        sharedPreferences.edit().putString(key,valor).apply()
    }

    fun getString(key: String){
    }
}