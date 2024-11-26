// call by value
public class product {
    public static int multiply(int a, int b) { // parameters
        int multi = a * b;
        // System.out.println(multi);
        return multi;
    }

    public static void main(String[] args) {
        int a = 5, b = 2;
        multiply(a, b);// arguments
    }
}