package com.example.datastructuresapp


class MyMap: com.example.datastructuresapp.Map{

    private var myMap: ArrayList<MapEntry> = ArrayList()


    override fun containsKey(key: Any): Boolean {
        var returnValue = false
        for(item in myMap) {
            if(key == item.getKey()){
                returnValue = true
            }
        }
        return returnValue
    }

    override fun containsValue(value: Any): Boolean {
        var returnValue = false
        for(item in myMap) {
            if(value == item.getValue()){
                returnValue = true
            }
        }
        return returnValue
    }

    override fun getValue(key: Any): Any? {
        var returnValue: Any? = null
        for(item in myMap) {
            if (key == item.getKey()){
                returnValue = item.getValue()
            }
        }
        return returnValue
    }

    fun isEmpty(): Boolean {
        return myMap.isEmpty()
    }

    override fun clear() {
        myMap.clear()
    }


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

    fun getIndex(int: Int): MapEntry {
        return myMap[int]
    }



}
