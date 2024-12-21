import java.util.*;
import java.util.Arrays;

public class rough {
    public static void hIndex(int[] citations) {
        // code here
        int hIndex = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length / 2; i++) {
            int temp = citations[i];
            citations[i] = citations[citations.length - 1 - i];
            citations[citations.length - 1 - i] = temp;
            if (citations[i] >= i) {
                hIndex++;
            }
        }

        System.out.println(hIndex);

    }

    public static void main(String[] args) {
        int citations[] = { 5, 1, 2, 4, 1 };
        hIndex(citations);
    }
}
