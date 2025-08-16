package Generics;

import java.util.*;

public class GenericsDemo {

    public static void main(String[] args) {

        // -------------------- 1. Without Generics --------------------
        System.out.println("=== Without Generics ===");

        // Old way: raw ArrayList (type is Object by default)
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(10); // Allowed, but logically wrong for a list of Strings

        // Problem: Must cast when retrieving
        try {
            String str = (String) list.get(0); // Works fine
            System.out.println("First element: " + str);

            // This will throw ClassCastException at runtime ❌
            String wrong = (String) list.get(1);
            System.out.println("Second element: " + wrong);
        } catch (ClassCastException e) {
            System.out.println("Runtime Error: " + e);
        }

        // -------------------- 2. With Generics --------------------
        System.out.println("\n=== With Generics ===");

        // Now, ArrayList only accepts Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Java");
        // stringList.add(100); // ❌ Compile-time error

        // No need for casting
        String lang = stringList.get(0);
        System.out.println("First element: " + lang);

        // -------------------- 3. Custom Generic Class --------------------
        System.out.println("\n=== Custom Generic Class ===");

        // A generic Box that can store any type
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println("Integer Box value: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Generics in Java");
        System.out.println("String Box value: " + strBox.get());

        // Same Box class works for different data types!
    }
}

// -------------------- Generic Class Definition --------------------
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
