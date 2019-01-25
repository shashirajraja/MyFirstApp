package com.shashi.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_welcome_page.*

class WelcomePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)
    }
    fun showText(view: View){
        var name = et1.getText()
        var email = et2.text
        var output = "Hey $name !\nKeep Your Email \"$email\" Safe!!"
        tv1.setText(output)
    }
}

