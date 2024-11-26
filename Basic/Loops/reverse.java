public class reverse {
    public static void main(String[] args) {
        int n = 451;
        while (n != 0) {
            int ld = n % 10;
            n = n / 10;
            System.out.print(ld);
        }

    }
}
