package com.example.administrator.testkotlinapp.bean

/**
 * Created by Administrator on 2017/7/25 0025.
 */
class Car {

    private var size: Int? = null;
    var name: String? = null;

    constructor(size: Int?, name: String?) {
        this.size = size
        this.name = name
    }

    fun getSize(): Int? = size


}