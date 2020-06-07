package com.kotlin.base64decrypter

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Base64
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun decrypt(view:View) {
        val oriString = inputcode.text.toString()

        val decodedBytes = Base64.getDecoder().decode(oriString)
        val decodedString = String(decodedBytes)
        outputcode.text = decodedString
    }

}