package com.example.datastructuresapp


interface Map {

    fun put(key: Any, value: Any): Any?

    fun remove(key: Any): Any?

    fun clear()

    fun getValue(key: Any): Any?

    fun containsValue(value: Any): Boolean

    fun containsKey(key: Any): Boolean

}