package Collection;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // PriorityQueue<Integer> p = new
        // PriorityQueue<>(Collections.reverseOrder());//*for maxHeap
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(20);
        p.add(40);
        p.add(50);
        p.add(30);

        p.forEach(n -> System.out.println(n));

        p.poll();
        System.out.println("===after deletion===");
        p.forEach(n -> System.out.println(n));

    }
}
