package OOPs;

public class Super {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}

class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        // *super() is called by default if not called explicitly
        // super();
        System.out.println("Dog constructor called");
    }
}
