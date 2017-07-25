package com.example.administrator.testkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import com.example.administrator.testkotlinapp.bean.Car

class MainActivity : AppCompatActivity() {

    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        initListener()

        var aa: Double = 555.222
        var str: String = "666"

        val toInt = str.toInt()

        var array = Array<Int>(5, { i -> i * i })

//        var carArray:Array<Car> = Array<Car>()

        var list: List<Car> = ArrayList<Car>()


//        var i:Int = 0
        for (i in 0..10) {
            println("i = $i TTTTTTTTTT")
//            carArray.plus(Car(i,"名字$i"))
        }

        println(list.toString())

        for (car in list) {
            println("car size : ${car.getSize()} , car name : ${car.name}")
        }

    }

    fun initView() {
        textView = findViewById(R.id.tv) as TextView
    }

    fun initListener() {
        textView?.setOnClickListener {
            Toast.makeText(this, "sdfasdf", Toast.LENGTH_LONG).show()
        }

        var t = getAddResult(a = 1, b = 2)
    }

    fun getAddResult(a: Int, b: Int) = a + b
    fun getAddResult(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

}
