package OOPs;

public class Basic_till_lech9 {
    public static void main(String[] args) {
        Pen p1 = new Pen("Cello Gripper"); // creates a pen object called p1 in the heap memory
        p1.setColor("Blue");
        // System.out.println(p1.color);
        System.out.println("from a getter: " + p1.getColor());
        p1.setTipSize(5);
        System.out.println(p1.tipSize);
        p1.tipSize = 4;
        System.out.println(p1.tipSize);

        BankAccount B1 = new BankAccount();
        B1.username = "Devendra";
        // B1.password = "1234"; //we can't change this direct because it is not visible

        B1.setPassword("1234"); // we can change it like this

        // constructor
        System.out.println("the name of the pen is:" + p1.name);
        Student s1 = new Student();
        s1.Student_name = "Rahul";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student s2 = new Student("Devendra");
        Student s3 = new Student("Niraj", 01);
        s3.pass = 1234;

        Student sCopy = new Student(s1);
        System.out.println("Copied Name: " + sCopy.Student_name);
        s1.marks[2] = 100; /*
                            * this below change(s1.marks[2] = 100;) will direct gets reflected on the
                            * copied result(reasone:
                            * bcoz
                            * only arrays referece is passed not the hole array)
                            * See the deep/shallow copy code for referece
                            */
        for (int i = 0; i < 3; i++) {
            System.out.println(sCopy.marks[i]);
        }
    }
}

// *Access Modifiers :-
class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    int tipSize;
    String name;

    // *these is the getters
    String getColor() {
        // ?here "this" keyword represents this/current object
        return this.color;
    }

    // * these are the setters↓
    // * Here, this.color refers to the class field, while color refers to the
    // method parameter.
    void setColor(String color) {
        this.color = color; // Resolves the conflict between the field and parameter names
        // *observe nothing is returned here only the value is assigned
    }

    void setTipSize(int newTipSize) {
        tipSize = newTipSize;
    }

    // *This below thing is called as Constructor
    Pen(String name) {
        // java automatically creates this if not created...
        // but we can not initialise anything in the automatically created constructor
        this.name = name;
    }
}

class Student {
    String Student_name;
    int roll_no;
    int pass;
    int marks[];

    /*
     * the below phenomenon of automatically detecting the required constructor is
     * called constructor overloading/polymorphism
     */

    Student() {
        marks = new int[3];
        System.out.println("non parameterized constructor");
    }

    // *parameterized constructor
    Student(String Sname) {
        marks = new int[3];
        this.Student_name = Sname;
    }

    Student(String Sname, int roll_no) {
        marks = new int[3];
        this.Student_name = Sname;
        this.roll_no = roll_no;
    }

    // *Copy constructor(shallow)
    // Student(Student s1) {
    // marks = new int[3];
    // this.Student_name = s1.Student_name;
    // this.roll_no = s1.roll_no;
    // this.pass = s1.pass;
    // // *only the reference of array gets copied...
    // this.marks = s1.marks;
    // }
    // *Copy constructor(deep)
    Student(Student s1) {
        marks = new int[3];
        this.Student_name = s1.Student_name;
        this.roll_no = s1.roll_no;
        this.pass = s1.pass;
        // *the hole array gets copied...
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
