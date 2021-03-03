package com.example.datastructuresapp

/**
 * Interface which will describes the functionality of the Map.
 */

interface Map {

    /**
     * Function which puts a new pair into the map, replaces the value of the key if the key already exists.
     * @params: The key and the value.
     * @return The previous value associated with this key if the key existed previously, else returns null.
     */

    fun put(key: Any, value: Any): Any?

    /**
     * Function which removes a pair from the map if the key exists.
     * @params: The key.
     * @return The value of the key pair being removed.
     */

    fun remove(key: Any): Any?

    /**
     * Function which clears the map of all of its contents.
     */

    fun clear()

    /**
     * Function which gets a value corresponding to a key.
     * @param: The key.
     * @return The value.
     */

    fun getValue(key: Any): Any?

    /**
     * Function which checks if the map contains a certain value.
     * @param: The value.
     * @return True if it contains the value.
     */

    fun containsValue(value: Any): Boolean

    /**
     * Function which checks if the map contains a certain key.
     * @param: The key.
     * @return True if it contains the key.
     */

    fun containsKey(key: Any): Boolean

}