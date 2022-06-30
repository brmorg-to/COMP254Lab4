package com.exercise3.bruno.morgado;

import com.exercise2.bruno.morgado.SinglyLinkedList;

public class LinkedQueue<E> implements Queue<E>{
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();    // Empty singly linked list

    public LinkedQueue() { }            // new queue relies on the initially empty list

    public SinglyLinkedList<E> getList() {
        return list;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void enqueue(E element) {
        list.addLast(element);
    }

    @Override
    public E first() {
        return list.first();
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

    public void traverse() {
        list.traverse();
    }

    public void concatenate(LinkedQueue<E> q2) throws CloneNotSupportedException {
        SinglyLinkedList<E> list2 = q2.getList();
        list.concatenate(list2);
    }
}
