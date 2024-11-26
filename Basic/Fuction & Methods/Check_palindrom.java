public class Check_palindrom {
    public static int palindro(int n) {
        int org = n;
        int ld = 0;
        int p = 0;
        while (n > 0) {
            ld = n % 10;
            p = 1;
            n = n / 10;
        }
        if (org == p) {
            System.out.println("palindrom");
        } else {
            System.out.println("not palindrom");
        }
        return n;
    }

    public static void main(String[] args) {
        palindro(121);
    }
}
