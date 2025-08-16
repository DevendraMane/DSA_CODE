package Generics;
// File: GenericsDosAndDonts.java

import java.util.ArrayList;
import java.util.List;

public class GenericsDosAndDonts {

    public static void main(String[] args) {

        // ---------------- 1. Only "extends" is allowed in Generic class definition
        // ----------------
        // Example: Class with "extends" in type bound
        MyClass<Integer> obj1 = new MyClass<>();
        obj1.setValue(100);
        System.out.println("Value in MyClass: " + obj1.getValue());

        // ---------------- 2. "extends" is used for interfaces also ----------------
        // Multiple bounds: one class + multiple interfaces
        MyMultipleBoundClass<MyChild> multi = new MyMultipleBoundClass<>();
        multi.print();

        // ---------------- 3. Extends from only ONE class and MULTIPLE interfaces
        // ----------------
        // This is already shown in MyMultipleBoundClass declaration

        // ---------------- 4. extends and super are allowed with "?" in methods
        // ----------------
        List<Integer> intList = List.of(1, 2, 3);
        List<Number> numList = new ArrayList<>();

        // Upper bound (? extends Number) - can read, cannot add new elements (except
        // null)
        printList(intList); // Allowed
        // printList(numList); // Allowed because Number is super of Integer

        // Lower bound (? super Integer) - can add integers, but reading gives Object
        addIntegers(numList);
        System.out.println("Numbers after adding: " + numList);

        // ---------------- 5. <?> will accept all types but cannot access
        // ----------------
        List<String> strList = List.of("A", "B", "C");
        acceptAll(strList); // We can accept but can't add new elements

        // ---------------- 6. Base type of an Object should be same or use "?"
        // ----------------
        List<Integer> list1 = new ArrayList<>();
        // List<Number> list2 = list1; // ❌ Compile error (invariance)
        List<? extends Number> list3 = list1; // ✅ Allowed
    }

    // ---------------- Helper Methods ----------------

    // Method with upper bound wildcard
    public static void printList(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println("Number: " + num);
        }
    }

    // Method with lower bound wildcard
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    // Method with unbounded wildcard
    public static void acceptAll(List<?> list) {
        System.out.println("List contents: " + list);
        // list.add("Hello"); // ❌ Compile error
    }
}

// ---------------- Classes for Point 1 ----------------
class MyClass<T extends Number> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

// ---------------- Classes for Point 2 & 3 ----------------
interface MyInterface1 {
    void print();
}

interface MyInterface2 {
}

class MyParent {
}

class MyChild extends MyParent implements MyInterface1, MyInterface2 {
    public void print() {
        System.out.println("Inside MyChild");
    }
}

class MyMultipleBoundClass<T extends MyParent & MyInterface1 & MyInterface2> {
    public void print() {
        System.out.println("Multiple bounds: one class + multiple interfaces");
    }
}
