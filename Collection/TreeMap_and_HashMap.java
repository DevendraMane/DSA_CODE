package Collection;

import java.util.*;

public class TreeMap_and_HashMap {
    public static void main(String[] args) {
        // sorted
        // TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3,
        // "D", 9, "x", 7, "a"));

        // System.out.println(tm.get(1)); // *to get value using its key
        // System.out.println(tm.put(5, "E")); // *to get value using its key
        // System.out.println(tm);

        System.out.println("===HashMap===");
        HashMap<Integer, String> hm = new HashMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D", 9, "x", 7, "a", 4, "z"));

        System.out.println(hm.get(1)); // *to get value using its key
        System.out.println(hm.put(5, "E")); // *to get value using its key
        System.out.println(hm);
        // System.out.println(hm.firstEntry().getValue());
    }
}
