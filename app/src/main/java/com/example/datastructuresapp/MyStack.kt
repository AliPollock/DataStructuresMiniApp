package com.example.datastructuresapp

class MyStack<E>:Stack<E> {

    private var myStack: ArrayList<E> = ArrayList()

    override fun push(element: E) {
        myStack.add(element)
    }

    override fun pop(): E {
        var poppedElement =  top()
        myStack.removeAt(myStack.lastIndex)
        return poppedElement
    }

    override fun top(): E {
        return myStack[myStack.lastIndex]
    }

    override fun isEmpty(): Boolean {
        return myStack.isEmpty()
    }

    override fun size(): Int {
        return myStack.size
    }

    fun getIndex(int: Int): E {
        return myStack.get(int)
    }

    override fun clear(){
        myStack.clear()
    }
}
