package com.ranadeep.Algorithms.Stack;

public interface Stack<E> {
//Every stack implementation should have the following methods implemented
    int size(); //returns the size of the stack

    boolean isEmpty();

    void push(E e);

    E pop();

    E top();
}
