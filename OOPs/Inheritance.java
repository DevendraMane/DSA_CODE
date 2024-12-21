package OOPs;

import Basic.pattern2.solid_rhombus;

public class Inheritance {
    public static void main(String[] args) {
        // ?Single Level Inheritance
        // Dog Luffy = new Dog();
        // // below code is accessing the property of parent class Animal
        // Luffy.eat();

        // ?Multi Level Inheritance
        Child c = new Child();
        c.MusicTaste();
        c.JaminOwner();
        c.Pota();

        // ?Hierarchical Inheritance
        Beta1 b1 = new Beta1();
        b1.papa();

        Beta2 b2 = new Beta2();
        b2.papa();
    }
}

// todo:Single Level Inheritance
// * Base Class/Parent Class
// class Animal {
// String Color;

// void eat() {
// System.out.println("Animal eats");
// }

// }

// // * Derived Class/Child Classs/Subclass
// class Dog extends Animal {
// int legs;

// void sound() {
// System.out.println("Bhau Bhau!!");
// }
// }

// todo:Multi Level Inheritance
// * Base Class/Parent Class
class GrandParent {
    void MusicTaste() {
        System.out.println("lata mangeshkar");
    }

    void Pota() {
        System.out.println("GrandChild");
    }
}

// * Derived Class/Child Classs/Subclass
class Parent extends GrandParent {
    void MusicTaste() {
        System.out.println("Arijit Singh");
    }

    void JaminOwner() {
        System.out.println("Yes");
    }
}

// * Derived Class/Child Classs/Subclass
class Child extends Parent {
    void MusicTaste() {
        System.out.println("Anuv Jain");
    }
}

// todo:Hierarchical Inheritance
// * Base Class/Parent Class
class PAPA {
    void papa() {
        System.out.println("PAPA");
    }
}

// * Derived Class/Child Classs/Subclass
class Beta1 extends PAPA {
    void beta1() {
        System.out.println("Beta1");
    }
}

// * Derived Class/Child Classs/Subclass
class Beta2 extends PAPA {
    void beta2() {
        System.out.println("Beta2");
    }
}

// todo:Hybrid Inheritance
// * Base Class/Parent Class
class Animal {
    String Color;

    void eat() {
        System.out.println("Animal eats");
    }

}

// * Derived Class/Child Classs/Subclass
class Mamal extends Animal {
    int legs;

    void walk() {
        System.out.println("Mamal walks");
    }
}

// * Derived Class/Child Classs/Subclass
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Fish swims");
    }
}

// * Derived Class/Child Classs/Subclass
class Bird extends Animal {
    int wings;

    void fly() {
        System.out.println("Bird flies");
    }
}

public class GoldFish extends Fish {
    void color() {
        System.out.println("GoldFish is golden in color");
    }

}