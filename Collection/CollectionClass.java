package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionClass {

    public static void main(String[] args) {

        // Create a Collection using ArrayList
        Collection<String> collection1 = new ArrayList<>();

        // 1. add(E e) → Adds an element
        collection1.add("A");
        collection1.add("B");
        System.out.println("After add(): " + collection1);

        // 2. addAll(Collection<E> c) → Adds all elements from another collection
        // *asList is used to quickly create a fixed-size list from the given elements
        Collection<String> collection2 = Arrays.asList("C", "D", "E");
        collection1.addAll(collection2);
        System.out.println("After addAll(): " + collection1);

        // 3. remove(Object o) → Removes a specific element
        collection1.remove("B");
        System.out.println("After remove(): " + collection1);

        // 4. removeAll(Collection<E> c) → Removes all elements present in another
        // collection
        collection1.removeAll(Arrays.asList("C", "E"));
        System.out.println("After removeAll(): " + collection1);

        // 5. retainAll(Collection<E> c) → Keeps only elements that are also in the
        // given collection
        collection1.retainAll(Arrays.asList("A", "D"));
        System.out.println("After retainAll(): " + collection1);

        // 6. clear() → Removes all elements
        collection1.clear();
        System.out.println("After clear(): " + collection1);

        // Add elements again for next examples
        collection1.addAll(Arrays.asList("X", "Y", "Z"));

        // 7. isEmpty() → Checks if collection is empty
        System.out.println("isEmpty(): " + collection1.isEmpty());

        // 8. contains(Object o) → Checks if element exists
        System.out.println("contains(\"Y\"): " + collection1.contains("Y"));

        // 9. containsAll(Collection<E> c) → Checks if all elements of another
        // collection exist
        System.out.println("containsAll([X, Z]): " + collection1.containsAll(Arrays.asList("X", "Z")));

        // 10. equals(Object o) → Checks if two collections are equal
        Collection<String> collection3 = Arrays.asList("X", "Y", "Z");
        System.out.println("equals(): " + collection1.equals(collection3));

        // 11. size() → Number of elements
        System.out.println("size(): " + collection1.size());

        // 12. iterator() → Returns an iterator to loop through elements
        System.out.print("iterator(): ");
        Iterator<String> it = collection1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 13. toArray() → Converts collection to array
        Object[] array = collection1.toArray();
        System.out.println("toArray(): " + Arrays.toString(array));
    }
}
