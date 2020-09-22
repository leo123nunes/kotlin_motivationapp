package com.leo123nunes.motivationapp.infra

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

class SecurityPreferences(context: Context){
    private var msharedPreferences = context.getSharedPreferences("motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, valor: String){
        msharedPreferences.edit().putString(key,valor).apply()
    }

    fun getString(key: String): String{
        return msharedPreferences.getString(key,"") ?: ""
    }
}