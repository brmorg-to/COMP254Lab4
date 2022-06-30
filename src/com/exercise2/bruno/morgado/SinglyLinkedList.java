package com.exercise2.bruno.morgado;

public class SinglyLinkedList<E> implements Cloneable{
    //---------------- nested Node class ----------------
    private static class Node<E>{
        private E element;      // reference to the element stored at this node
        private Node<E> next;   // reference to the subsequent node in the list
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }
        public E getElement() {
            return element;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> n) {
            next = n;
        }
    }//----------- end of nested Node class -----------
    // instance variables of the SinglyLinkedList
    private Node<E> head = null;        // head node of the list (or null if empty)
    private Node<E> tail = null;        // last node of the list (or null if empty)
    private int size = 0;               // number of nodes in the list
    public SinglyLinkedList() { }       // constructs an initially empty list
    @Override
    protected SinglyLinkedList<E> clone() throws CloneNotSupportedException {
        SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone( ); //safe cast
//        if (size > 0) {
//            other.head = new Node<>(head.getElement( ), null);
//            Node<E> walk = head.getNext( );         // walk through remainder of original list
//            Node<E> otherTail = other.head;         // remember most recently created node
//            while (walk != null) {                  // make a new node storing same element
//                Node<E> newest = new Node<>(walk.getElement( ), null);
//                otherTail.setNext(newest); // link previous node to this one
//                otherTail = newest;
//                walk = walk.getNext( );
//            }
//        }
        return other;
    }

    // access methods
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public E first() {                  // returns but does not remove the first element
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }
    public E last() {                  // returns but does not remove the last element
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    // update methods
    public void addFirst(E e) {         // adds element e to the front of the list
        head = new Node<>(e, head);     // create and link a new node
        if (size == 0) {
            tail = head;                // special case: new node becomes tail also
        }
        size++;
    }
    public void addLast(E e) {          // adds element e to the end of the list
        Node<E> newest = new Node<>(e, null);   // node will eventually become the tail
        if (isEmpty()) {
            head = newest;              // special case: previously empty list
        } else {
            tail.setNext(newest);       // new node after existing tail
        }
        tail = newest;                  // new node becomes the tail
        size++;
    }
    public E removeFirst() {            // removes and returns the first element
        if(isEmpty()) {                 // nothing to remove
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();          // will become null if the list had only one element
        size--;
        if (size == 0) {
            tail = null;                // special case: The list is now empty
        }
        return answer;
    }
    public void traverse () {
        Node<E> actualNode = head;
        if(actualNode == null) {
            System.out.println("No elements");
        }
        while(actualNode != null) {
            System.out.print(actualNode.getElement() + " ");
            actualNode = actualNode.getNext();
        }
    }
    public void concatenate (SinglyLinkedList<E> list2) throws CloneNotSupportedException {

        if(list2.isEmpty()){
            System.out.println("List 2 is empty. Nothing to do.");
        }
        SinglyLinkedList<E> clone = list2.clone();

        if(head == null) {
            head = clone.head;
        }
        tail.setNext(clone.head);
        size += clone.size();
        list2.head = null;
        list2.tail = null;
        list2.size = 0;
    }

}
