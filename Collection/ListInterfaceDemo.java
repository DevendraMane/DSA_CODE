package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceDemo {

    public static void main(String[] args) {

        // Create a List (ArrayList implementation)
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        // 1. add(int index, E element) → Inserts element at specific position
        list.add(2, "X");
        System.out.println("After add(index, element): " + list);

        // 2. addAll(int index, Collection<? extends E> c) → Inserts all elements at a
        // given index
        list.addAll(3, Arrays.asList("Y", "Z"));
        System.out.println("After addAll(index, collection): " + list);

        // 3. remove(int index) → Removes element at specific position
        list.remove(1); // removes "B"
        System.out.println("After remove(index): " + list);

        // 4. get(int index) → Returns element at index
        String element = list.get(2);
        System.out.println("Element at index 2: " + element);

        // 5. set(int index, E element) → Replaces element at index
        list.set(2, "P");
        System.out.println("After set(index, element): " + list);

        // 6. subList(int fromIndex, int toIndex) → Returns part of the list [from, to)
        List<String> sub = list.subList(1, 4);
        System.out.println("Sublist from index 1 to 4: " + sub);

        // 7. indexOf(Object o) → Returns first index of element, or -1 if not found
        System.out.println("Index of 'P': " + list.indexOf("P"));

        // 8. lastIndexOf(Object o) → Returns last occurrence of element
        list.add("A"); // duplicate for testing
        System.out.println("List after adding another 'A': " + list);
        System.out.println("Last index of 'A': " + list.lastIndexOf("A"));

        // 9. listIterator() → Returns ListIterator for full list
        // *This is bi-directional
        System.out.print("Using listIterator(): ");
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 10. listIterator(int index) → Starts iteration from given index
        System.out.print("Using listIterator(from index 2): ");
        ListIterator<String> it2 = list.listIterator(2);
        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }
        System.out.println();
    }
}
