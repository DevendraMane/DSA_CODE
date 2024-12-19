package OOPs;

public class Inheritance {
    public static void main(String[] args) {
        Dog Luffy = new Dog();
        // below code is accessing the property of parent class Animal
        Luffy.eat();
    }
}

// * Base Class/Parent Class
class Animal {
    String Color;

    void eat() {
        System.out.println("Animal eats");
    }
}

// * Derived Class/Child Classs/Subclass
class Dog extends Animal {
    int legs;

    void sound() {
        System.out.println("Bhau Bhau!!");
    }
}