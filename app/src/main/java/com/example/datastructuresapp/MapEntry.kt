package com.example.datastructuresapp

import java.lang.Exception

class MapEntry(key: Any, value: Any?) {

    private var key: Any = key
    private var value: Any? = value


    fun setValue(value: Any) {
        this.value = value
    }

//    fun delete() {
//        this.key = null
//        this.value = null
//    }

    fun getKey(): Any? {
        return this.key
    }

    fun getValue(): Any? {
        return this.value
    }

}