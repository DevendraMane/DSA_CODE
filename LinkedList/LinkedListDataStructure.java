package LinkedList;

import Recursion.n_to_1_and_1_to_n;

class Linkedlist {
    Node head; // null initially
    Node tail; // null initially
    int size;

    void addAtTail(int val) {
        // Node temp = new Node(val); // creat a Node(temp) with provided val, which is
        // not connected to anything
        // // initially
        // if (tail == null) { // if listedlist is null initially
        // head = tail = temp;
        // } else {
        // tail.next = temp; // attach the temp to tail
        // tail = temp; // move tail to the temp
        // }
        // size++;

        // * we can do it like this also
        if (tail == null) {
            addAtHead(val);
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;
        tail = temp;
        size++;
    }

    void addAtHead(int val) {
        Node temp = new Node(val); // creat a Node(temp) with provided val, which is not connected to anything
                                   // initially
        if (head == null) { // if listedlist is null initially
            head = tail = temp;
        } else {
            temp.next = head; // attach the temp to head
            head = temp; // move head to the temp
        }
        size++;
    }

    void deleteAtHead() {
        // edge case for null LinkedList
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        // edge case for single Node(understand this properly)
        if (head == null) {
            tail = head;
        }
        size--;
    }

    void display() {
        if (head == null) {
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    int search(int val) {
        if (head == null) {
            return -1;
        }

        Node temp = head;
        int idx = 0;

        while (temp != null) {
            if (temp.val == val) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    // todo: Understand how this works visually
    // !Note: TWO NODES can point at a SINGLE NODE but ONE NODE can't point at TWO
    // ! different NODES
    void insert(int val, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Invaid Index");
            return;
        }

        if (idx == 0) {
            addAtHead(val);
        } else if (idx == size) {
            addAtTail(val);
        } else {
            Node temp = head;
            Node t = new Node(val);

            for (int i = 0; i <= idx - 1; i++) {
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t;
            size++;
        }

    }

    int get(int idx) {
        Node temp = head;

        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    void delete(int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Invaid Index");
            return;
        }

        if (idx == 0) {
            deleteAtHead();
            return;
        }

        Node temp = head;

        if (idx == size - 1) {
            tail = temp;
        }

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next; // understand this clearly
        size--;

    }
}

class PLinkedlist {
    Node head;
    Node tail;

    void addAtTail(int n) {
        Node temp = new Node(n);
        if (tail == null) {
            tail = head = temp;
        }
        tail.next = temp;
        tail = temp;
    }

    void addAtHead(int n) {
        Node temp = new Node(n);
        if (head == null) {
            tail = head = temp;
        }
        temp.next = head;
        head = temp;
    }

    void deleteAtHead() {
        if (head == null) {
            System.out.print("List is Empty");
            return;
        }

        head = head.next;

        if (head == null) {
            tail = head;
        }
    }

    void display() {
        Node temp = head;

        if (temp == null) {
            return;
        }

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        PLinkedlist Pll = new PLinkedlist();

        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.display();

        ll.addAtHead(5);
        ll.display();

        ll.deleteAtHead();
        ll.display();
        // System.out.println(ll.search(30)); // 2

        ll.insert(35, 5);
        ll.display();

        // System.out.println(ll.get(3));
        ll.delete(3);
        ll.display();

        // ? for Practice
        // Pll.addAtTail(10);
        // Pll.addAtTail(20);
        // Pll.addAtTail(30);
        // Pll.addAtTail(40);
        // Pll.addAtTail(50);
        // Pll.addAtHead(60);
        // Pll.display();

        // Pll.addAtHead(5);
        // Pll.display();

        // Pll.deleteAtHead();
        // Pll.display();
    }
}
