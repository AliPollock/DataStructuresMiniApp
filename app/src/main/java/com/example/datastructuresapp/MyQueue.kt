package com.example.datastructuresapp

/**
 * Class which will act as the Queue. Implements the Queue Interface.
 */

class MyQueue<E>: Queue<E> {

    private var myQueue: ArrayList<E> = ArrayList()

    /**
     * Function which adds a new element to the back of the queue.
     * @param: The element being added.
     */

    override fun add(e: E) {
        myQueue.add(0, e)
    }

    /**
     * Function which removes an element from the front of the queue.
     * @param: The element being removed.
     */

    override fun remove(): E {
        var poppedElement =  peek()
        myQueue.removeAt(myQueue.lastIndex)
        return poppedElement
    }

    /**
     * Function which checks the size of the queue.
     * @return The size.
     */

    override fun size(): Int {
        return myQueue.size
    }

    /**
     * Function which returns the element at the front of the queue and leaves the queue unchanged.
     * @return The element at the front of the queue.
     */

    override fun peek(): E {
        return myQueue[myQueue.lastIndex]
    }

    /**
     * Function which gets the element at a given index
     * @param: The index.
     * @return The element.
     */

    fun getIndex(int: Int): E {
        return myQueue.get(int)
    }

    /**
     * Function which clears the queue of all elements.
     */

    override fun clear() {
        myQueue.clear()
    }

}