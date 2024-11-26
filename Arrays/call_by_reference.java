package Arrays;

public class call_by_reference {
    public static void array_is_call_by_reference(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {

        int marks[] = { 43, 44, 45 };
        array_is_call_by_reference(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

    }
}
