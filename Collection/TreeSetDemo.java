package Collection;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        set.forEach(n -> System.out.print(n + " "));
        set.add(35);

        System.out.println("\n====After Adding====if got auto added after 30(sorted)");
        set.forEach(n -> System.out.print(n + " "));
        //
    }
}