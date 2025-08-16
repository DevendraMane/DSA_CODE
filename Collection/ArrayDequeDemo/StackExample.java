package Collection.ArrayDequeDemo;

import java.util.*;

// As a Stack (LIFO — Last In, First Out)

// Stack me:

// Push element at top → push() / addFirst()

// Pop element from top → pop() / removeFirst()

// Peek top element → peek() / getFirst()

public class StackExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Pop
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());
        System.out.println("Top: " + stack);
    }
}
