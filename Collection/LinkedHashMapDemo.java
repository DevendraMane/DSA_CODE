package Collection;

import java.util.*;;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(3) {
            @Override
            protected boolean removeEldestEntry(Map.Entry e) {
                return size() > 3;
            }
        };

        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");

        System.out.println(lhm);
    }
}
