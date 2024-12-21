package OOPs;

import javax.swing.Box;

public class Abstraction {
    public static void main(String[] args) {
        // Dog d = new Dog();
        // d.eat();
        // d.walk();
        // System.out.println(d.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        // !We can't create object of abstract class
        // Animal a = new Animal();

        // *constructor heirarchy
        Boxer b = new Boxer();
        // Animal -> Dog -> Boxer

    }
}

abstract class Animal {
    // constructor
    String color;

    Animal() {
        color = "brown";
        System.out.println("Animal constructor called");
    }

    // *See we can't implement the method here
    void eat() {
        System.out.println("animal eats");
    }

    // *But here we can't implement the method(only give idea)
    abstract void walk();
}

class Dog extends Animal {
    // *here Animal() constructor will be called 1st
    void changeColor() {
        color = "black";
    }

    // *It is necessary to implement the abstract method here
    void walk() {
        System.out.println("Dog walks on 4 legs");
    }
}

class Boxer extends Dog {
    Boxer() {
        System.out.println("Boxer constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "white";
    }

    // *It is necessary to implement the abstract method here also
    // *this walk method is different from the walk method of Dog class
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}
