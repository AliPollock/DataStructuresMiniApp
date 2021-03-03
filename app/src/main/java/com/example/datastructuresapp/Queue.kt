package com.example.datastructuresapp

interface Queue<E> {

    /**
     * Function which adds a new element to the back of the queue.
     * @param: The element being added.
     */

    fun add(e: E)

    /**
     * Function which removes an element from the front of the queue.
     * @param: The element being removed.
     */

    fun remove(): E

    /**
     * Function which returns the element at the front of the queue and leaves the queue unchanged.
     * @return The element at the front of the queue.
     */

    fun peek(): E

    /**
     * Function which clears the queue of all elements.
     */

    fun clear()

    /**
     * Function which checks the size of the queue.
     * @return The size.
     */

    fun size(): Int
}
