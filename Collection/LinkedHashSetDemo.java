package Collection;

import java.util.*;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(5);

        lhs.add("A");
        lhs.add("C");
        lhs.add("B");
        lhs.add("E");
        lhs.add("D");
        System.out.println(lhs);

        System.out.println("===HashSet===");
        LinkedHashSet<String> hs = new LinkedHashSet<>(5);
    }
}