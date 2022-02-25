package com.faizil.apicoba2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding

class CreateActivity : AppCompatActivity() {
    private lateinit var binding: InputBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)
    }
/*
    private fun createPos(){
        RetrofitClient.instance.createPost(
            name = name
        )
    }
*/
}