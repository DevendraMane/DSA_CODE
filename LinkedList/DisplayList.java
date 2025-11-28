package LinkedList;

//*The Node class is present in basics.java(LinkedList folder)
public class DisplayList {
    public static void displayRec(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " "); // work
        displayRec(head.next); // call
    }

    public static void display(Node head) {

        Node temp = head;
        // System.out.print(temp.val);

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // how to get value at a perticular node if the index is given(0 based indexing)
    public static int get(Node head, int idx) {
        Node temp = head;

        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    public static void main(String[] args) {
        Node a = new Node(1); // head

        Node b = new Node(2);

        Node c = new Node(3);

        // connet the node
        a.next = b;
        b.next = c;

        // display(a);

        // by recursive method
        // displayRec(a);

        // to get value at a perticular index
        System.out.println(get(a, 1));
        ;

    }
}
