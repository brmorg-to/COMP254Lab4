package com.exercise3.bruno.morgado;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        LinkedQueue<Integer> firstQueue = new LinkedQueue<>();
        firstQueue.enqueue(1);
        firstQueue.enqueue(2);
        firstQueue.enqueue(3);
        firstQueue.enqueue(4);
        firstQueue.enqueue(5);

        System.out.println("\nFirst Linked Queue:");
        firstQueue.traverse();
        System.out.println();

        LinkedQueue<Integer> secondQueue = new LinkedQueue<>();
        secondQueue.enqueue(6);
        secondQueue.enqueue(7);
        secondQueue.enqueue(8);
        secondQueue.enqueue(9);
        secondQueue.enqueue(10);

        System.out.println("\nSecond Linked Queue");
        secondQueue.traverse();
        System.out.println();

        firstQueue.concatenate(secondQueue);

        System.out.println("\nFirst Linked Queue after concatenation:");
        firstQueue.traverse();
        System.out.println();
        System.out.println("\nFirst Linked Queue's size: " + firstQueue.size());

        System.out.println("\nIs second Linked Queue empty?");
        if(secondQueue.isEmpty()){
            System.out.println("YES! Second Linked Queue is empty.");
        } else {
            System.out.println("No. Second Linked Queue still contains elements.");
        }
        System.out.println("\nSecond queue after concatenation:");
        secondQueue.traverse();
        System.out.println();

        System.out.println("\n**************************************");

        secondQueue.enqueue(11);
        secondQueue.enqueue(12);
        secondQueue.enqueue(13);
        secondQueue.enqueue(14);
        secondQueue.enqueue(15);
        System.out.println("\nNew elements of Second Linked Queue");
        secondQueue.traverse();
        System.out.println();
        System.out.println("\nA new look into the First Linked Queue");
        firstQueue.traverse();
        System.out.println();

    }
}
