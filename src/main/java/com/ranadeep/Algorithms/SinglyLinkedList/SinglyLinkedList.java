package com.ranadeep.Algorithms.SinglyLinkedList;

import java.util.List;

public class SinglyLinkedList<E> {

/*
The singly linked list contract should implement the following methods.
    size( ): Returns the number of elements in the list.
    isEmpty( ): Returns true if the list is empty, and false otherwise.
    first( ): Returns (but does not remove) the first element in the list.
    last( ): Returns (but does not remove) the last element in the list.
    addFirst(e): Adds a new element to the front of the list.
    addLast(e): Adds a new element to the end of the list.
    removeFirst( ): Removes and returns the first element of the list.
*/
    private Node<E> head;
    private Node<E> tail;
    private int size;
    private List<String> test;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public Node<E> first( ){
        if (!isEmpty()) return head;
        else return null;
     }

    public Node<E> last( ){
        if (!isEmpty()) return tail;
        else return null;
    }
    public Node addFirst(E e){
        Node<E> newnode = null;
        if (!isEmpty()){
             newnode= new Node(e,head);
        }
        else{
            tail=head=newnode;
        }
        return head;


    }



}
