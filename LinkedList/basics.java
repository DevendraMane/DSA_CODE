package LinkedList;

// !I can use this same Node class anywhere in the LinkedList Folder
class Node {
    int val;
    Node next; // default val: null

    // by using this(constructor) we can now directly put values into it
    Node(int val) {
        this.val = val;
        this.next = null; // *this by default behavior(don't have to do it manually)
    }
}

public class basics {
    public static void main(String[] args) {
        // 10 => 20 => 30
        // Node a = new Node();
        // a.val = 10;
        Node a = new Node(10);
        System.out.println(a); // LinkedList.Node@372f7a8d
        Node b = new Node(20);
        System.out.println(b); // LinkedList.Node@2f92e0f4
        // LinkedList.Node@2f92e0f4
        Node c = new Node(30);
        System.out.println(c); // LinkedList.Node@28a418fc
        // c.val = 30;

        // connet the node
        a.next = b;
        b.next = c;
        System.out.println(b.next);

        System.out.println(a.next.next.val); // 30
    }
}
