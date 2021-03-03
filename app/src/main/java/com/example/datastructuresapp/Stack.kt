package com.example.datastructuresapp

interface Stack<E> {

    /**
     * Function which adds a new element to the top of the stack.
     * @param: The element being added.
     */

    fun push(element: E)

    /**
     * Function which removes the element at the top of the stack
     * @return The element being removed.
     */

    fun pop(): E

    /**
     * Function which returns the element at the top of the stack and leaves the stack unchanged.
     * @return The element at the top of the stack.
     */

    fun top(): E

    /**
     * Function which checks if the stack is empty.
     * @return True if the stack is empty.
     */

    fun isEmpty(): Boolean

    /**
     * Function which checks the size of the stack.
     * @return The size.
     */

    fun size(): Int

    /**
     * Function which clears the stack of all elements.
     */

    fun clear()
}