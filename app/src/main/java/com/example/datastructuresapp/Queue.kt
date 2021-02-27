package com.example.datastructuresapp

interface Queue<E> {

    /** Inserts the specified element into this queue at the bottom **/
    fun add(e: E)

    /** Retrieves and removes the head of this queue */
    fun remove(): E

    /** Retrieves, but does not remove, the head of this queue */
    fun peek(): E

    fun clear()

    fun size(): Int
}
