package LinkedList;
//? 876. Middle of the Linked List

import java.lang.classfile.components.ClassPrinter.ListNode;

// Given the head of a singly linked list, return the middle node of the linked list.
// If there are two middle nodes, return the second middle node.
public class MiddleNode {

    static Node head;

    public static Node findMiddleNode() {
        // *M-1(find length->get middle->return what is asked)
        // ? This is not a ONE PASS solution
        // int length = 0;
        // Node temp = head;
        // while (temp != null) {
        // temp = temp.next;
        // length++;
        // }
        // temp = head; // bcoz the loop has forwarded the temp to null
        // for (int i = 0; i < length / 2; i++) {
        // temp = temp.next;
        // }
        // return temp;

        // *M-2(Slow-Fast Approach)
        // ? Slow–Fast Pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move 1 step
            fast = fast.next.next; // Move 2 steps
        }

        return slow; // slow will be at middle
    }

    public static void main(String[] args) {

        // Creating LinkedList: 1 -> 2 -> 3 -> 4 -> 5
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node mid = findMiddleNode();
        System.out.println("Middle Node: " + mid.val);
    }
}
