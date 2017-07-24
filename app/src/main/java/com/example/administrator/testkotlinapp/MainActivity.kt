package com.example.administrator.testkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        initListener()
    }

    fun initView(){
        textView = findViewById(R.id.tv) as TextView
    }

    fun initListener(){
        textView?.setOnClickListener {
            Toast.makeText(this,"sdfasdf",Toast.LENGTH_LONG).show()
        }
    }

}
