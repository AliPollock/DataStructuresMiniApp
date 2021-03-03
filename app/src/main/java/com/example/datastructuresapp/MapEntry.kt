package com.example.datastructuresapp


/**
 * Class which will act as the key value pair. Initialised with a key and an optional value.
 */

class MapEntry(key: Any, value: Any?) {

    private var key: Any = key
    private var value: Any? = value

    /**
     * Function which will set the value of the pair.
     * @params: The value.
     */

    fun setValue(value: Any) {
        this.value = value
    }

    /**
     * Function which will get the key of the pair.
     * @return The key.
     */

    fun getKey(): Any? {
        return this.key
    }

    /**
     * Function which will get the value of the pair.
     * @return The value.
     */

    fun getValue(): Any? {
        return this.value
    }

}