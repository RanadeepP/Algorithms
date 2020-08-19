package com.ranadeep.Algorithms.SinglyLinkedList;

public class Node<E> {

    private E dataElement;
    public Node<E> nextnodepointer;

    public Node(E element,Node<E> nextnode){
        this.dataElement=element;
        this.nextnodepointer=nextnode;
    }

    public E getElement(){
        return dataElement;
    }

    public Node getNext(){
        return nextnodepointer;
    }

    public void setNext(Node<E> node){
        this.nextnodepointer=node;
    }








}
