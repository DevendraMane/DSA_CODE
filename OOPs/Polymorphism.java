package OOPs;

public class Polymorphism {
    public static void main(String[] args) {
        // ? Method Overloading (Compile Time Polymorphism)
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1, 2, 3));
        System.out.println(calculator.add(1.0, 2.0));

        // ? Method Overriding (Run Time Polymorphism)
        Deer d = new Deer();
        // here it will only call the eat method of Deer class
        d.eat();
    }

}

// * Method Overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

}

// * Method Overriding
class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("eats grass");
    }
}
