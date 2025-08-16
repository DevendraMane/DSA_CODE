package Collection.ArrayDequeDemo;

import java.util.*;

// (As a Queue (FIFO — First In, First Out)

// Queue me:

// Add elements at rear → offer() / addLast()

// Remove elements from front → poll() / removeFirst()

// Peek front element → peek() / getFirst()
public class QueueExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // Enqueue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        // Dequeue
        System.out.println("Removed: " + queue.poll());
        System.out.println("Front: " + queue.peek());
        System.out.println("Queue: " + queue);
    }
}
