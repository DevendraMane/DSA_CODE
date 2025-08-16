package Collection;

import java.util.*;

class Point implements Comparable {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + " y=" + y;
    }

    public int compareTo(Object o) {
        // we are taking reference of Point Class here
        Point p = (Point) o;
        if (this.x < p.x) {
            return -1;
        } else if (this.x > p.x) {
            return 1;
        } else {
            if (this.y < p.y) {
                return -1;
            } else if (this.y > p.y) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

public class ComparableInterfaceDemo {
    public static void main(String[] args) {
        TreeSet<Point> set = new TreeSet<>();

        set.add(new Point(1, 2));
        set.add(new Point(5, 5));
        set.add(new Point(5, 2));

        System.out.println(set);
    }
}
