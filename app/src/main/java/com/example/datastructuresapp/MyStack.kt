package com.example.datastructuresapp

/**
 * Class which will act as the Stack. Implements the Stack Interface.
 */

class MyStack<E>:Stack<E> {

    private var myStack: ArrayList<E> = ArrayList()

    /**
     * Function which adds a new element to the top of the stack.
     * @param: The element being added.
     */

    override fun push(element: E) {
        myStack.add(element)
    }

    /**
     * Function which removes the element at the top of the stack
     * @return The element being removed.
     */

    override fun pop(): E {
        var poppedElement =  top()
        myStack.removeAt(myStack.lastIndex)
        return poppedElement
    }

    /**
     * Function which returns the element at the top of the stack and leaves the stack unchanged.
     * @return The element at the top of the stack.
     */

    override fun top(): E {
        return myStack[myStack.lastIndex]
    }

    /**
     * Function which checks if the stack is empty.
     * @return True if the stack is empty.
     */

    override fun isEmpty(): Boolean {
        return myStack.isEmpty()
    }

    /**
     * Function which checks the size of the stack.
     * @return The size.
     */

    override fun size(): Int {
        return myStack.size
    }

    /**
     * Function which gets the element at a given index
     * @param: The index.
     * @return The element.
     */

    fun getIndex(int: Int): E {
        return myStack.get(int)
    }

    /**
     * Function which clears the stack of all elements.
     */

    override fun clear(){
        myStack.clear()
    }
}
