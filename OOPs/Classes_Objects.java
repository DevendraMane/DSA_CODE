package OOPs;

public class Classes_Objects {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // creates a pen object called p1 in the heap memory
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTipSize(5);
        System.out.println(p1.tipSize);
        p1.tipSize = 4;
        System.out.println(p1.tipSize);

        BankAccount B1 = new BankAccount();
        B1.username = "Devendra";
        // B1.password = "1234"; //we can't change this direct because it is not visible

        B1.setPassword("1234"); // we can change it like this
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
    String color;
    int tipSize;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTipSize(int newTipSize) {
        tipSize = newTipSize;
    }
}
