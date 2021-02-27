package com.example.datastructuresapp


class MyQueue<E>: Queue<E> {

    private var myQueue: ArrayList<E> = ArrayList()

    override fun size(): Int {
        return myQueue.size
    }

    override fun add(e: E) {
        myQueue.add(0, e)
    }

    override fun remove(): E {
        var poppedElement =  peek()
        myQueue.removeAt(myQueue.lastIndex)
        return poppedElement
    }

    override fun peek(): E {
        return myQueue[myQueue.lastIndex]
    }

    override fun clear() {
        myQueue.clear()
    }

    fun getIndex(int: Int): E {
        return myQueue.get(int)
    }

}