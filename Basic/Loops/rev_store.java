public class rev_store {
    public static void main(String[] args) {
        int num = 6746464;
        int rev = 0;

        while (num > 0) {
            int ld = num % 10;
            num = num / 10;
            rev = (rev * 10) + ld;

        }
        System.out.print("stored the reverse of the number & its value is :" + rev);
    }
}
