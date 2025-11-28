package Stacks;

import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        // st.pop(); // Underflow error
        // st.peek(); // Underflow error
        st.add("devendra");
        st.add("dinesh");
        st.add("mane");

        System.out.println(st.size());
        System.out.println(st); // Auxillary Time is O(n) (understand what it means🤔)
        System.out.println(st.peek());
        System.out.println(st.pop()); // returns top-elem then removes it
        String s = st.pop(); // to store the poped elem

    }
}
