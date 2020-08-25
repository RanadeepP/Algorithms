package com.ranadeep.Algorithms.Queue;

public interface Queue<E> {

    int size();

    boolean isEmpty();

    void Enqueue(E e);

    E Dequeue();

    E first();

    /*These are the methods defined in the ADT contract.There can be other
    methods which would have been added in the java util implementation */
}
