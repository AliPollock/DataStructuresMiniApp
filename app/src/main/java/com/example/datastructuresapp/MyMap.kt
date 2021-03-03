package com.example.datastructuresapp

/**
 * Class which will act as the map. Implements the Map Interface. An arrayList which will hold MapEntry objects.
 */

class MyMap: com.example.datastructuresapp.Map{

    private var myMap: ArrayList<MapEntry> = ArrayList()

    /**
     * Function which checks if the map contains a certain key.
     * @param: The key.
     * @return True if it contains the key.
     */

    override fun containsKey(key: Any): Boolean {
        var returnValue = false
        for(item in myMap) {
            if(key == item.getKey()){
                returnValue = true
            }
        }
        return returnValue
    }

    /**
     * Function which checks if the map contains a certain value.
     * @param: The value.
     * @return True if it contains the value.
     */

    override fun containsValue(value: Any): Boolean {
        var returnValue = false
        for(item in myMap) {
            if(value == item.getValue()){
                returnValue = true
            }
        }
        return returnValue
    }

    /**
     * Function which gets a value corresponding to a key.
     * @param: The key.
     * @return The value.
     */

    override fun getValue(key: Any): Any? {
        /*This placeholder value is to differentiate between an existing key with a null value, and a non-existent key*/
        var returnValue: Any? = "empty"
        for(item in myMap) {
            if (key == item.getKey()){
                returnValue = item.getValue()
            }
        }
        return returnValue
    }

    /**
     * Function which checks if the map is empty.
     * @return True if the map is empty.
     */

    fun isEmpty(): Boolean {
        return myMap.isEmpty()
    }

    /**
     * Function which clears the map of all of its contents.
     */

    override fun clear() {
        myMap.clear()
    }

    /**
     * Function which puts a new pair into the map, replaces the value of the key if the key already exists.
     * @params: The key and the value.
     * @return The previous value associated with this key if the key existed previously, else returns null.
     */

    override fun put(key: Any, value: Any): Any? {
        var returnValue: Any? = null
        var keyInMap = false
        for(item in myMap){
            if(key == item.getKey()) {
                returnValue = item.getValue()
                item.setValue(value)
                keyInMap = true
            }
        }
        if (!keyInMap) {
            var newMapEntry = MapEntry(key, value)
            myMap.add(newMapEntry)
        }
        return returnValue
    }

    /**
     * Overload function which will put a lone key into the map with a null value associated with it.
     * @params: The key.
     * @return The previous value associated with this key if the key existed previously, else returns null.
     */

    fun put(key: Any): Any? {
        var returnValue: Any? = null
        var keyInMap = false
        for(item in myMap){
            if(key == item.getKey()) {
                returnValue = item.getValue()
                keyInMap = true
            }
        }
        if (!keyInMap) {
            var newMapEntry = MapEntry(key, null)
            myMap.add(newMapEntry)
        }
        return returnValue

    }

    /**
     * Function which removes a pair from the map if the key exists.
     * @params: The key.
     * @return The value of the key pair being removed.
     */

    override fun remove(key: Any): Any? {
        var returnValue: Any? = null
        for (item in myMap) {
            if(key == item.getKey()){
                returnValue = key
                myMap.remove(item)
                return item.getValue()
            }
        }
        return returnValue
    }

    /**
     * Function which gets the map entry at a given index (although a map is unordered, this is necessary to display the map items.
     * @param: The index.
     * @return The map entry at the given index.
     */

    fun getIndex(int: Int): MapEntry {
        return myMap[int]
    }



}
