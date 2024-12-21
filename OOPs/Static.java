package OOPs;

public class Static {

    // *We want only one main function for the public class Static(hence we use
    // static keyword)
    public static void main(String[] args) {

        Student1 s1 = new Student1();

        s1.Schoolname = "BKV";

        Student1 s2 = new Student1();

        System.out.println(s2.Schoolname);
    }
}

class Student1 {

    String name;
    int roll_no;

    static String Schoolname;

    Student1() {
        System.out.println("Constructor called");
    }
}
