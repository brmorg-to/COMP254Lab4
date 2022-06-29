package com.exercise2.bruno.morgado;

public class App {
    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("Bruno");
        stack.push("Sissa");
        stack.push("Lucas");
        stack.push("Leo");
        stack.push("Carolina");
        stack.push("Doris");

        System.out.println("\nThe ORIGINAL stack is:");
        stack.traverse();

        LinkedStack<String> reversed = new LinkedStack<>();
        // create a reversed clone of the first stack
        transfer(stack, reversed);
        System.out.println("\nThe REVERSED stack is:");
        reversed.traverse();
    }

    /**
     * Function name: transfer
     * @param S (LinkedStack<E>)
     * @param T (LinkedStack<E>)
     * @param <E> (Generic type)
     * Inside the function:
     * 1. Removes all elements from the first positional argument and pushes onto the second.
     */
    public static <E> void transfer(LinkedStack<E> S, LinkedStack<E> T) {
        while (!S.isEmpty()) {
            T.push(S.pop());
        }
    }
}
