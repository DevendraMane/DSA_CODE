package Collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // LinkedList<Integer> LL1 = new LinkedList<>(20); //❌ can't initial the
        // linked-list with a value

        LinkedList<Integer> LL1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        LinkedList<Integer> LL2 = new LinkedList<>(LL1);
        // *Some methods same as ArrayList
        // LL1 = Arrays.;
        LL2.add(1, 99);
        LL2.add(69);// this will get add at the end
        LL2.poll();
        LL2.remove();

        // *Extra methods with LinkedList
        LL2.addFirst(1);
        LL2.addLast(70);
        for (Integer x : LL2) {
            System.out.println(x);
        }
    }
}
