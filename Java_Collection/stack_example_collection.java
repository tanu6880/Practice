package Java_Collection;

import java.util.Stack;

public class stack_example_collection {

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        System.out.println(s1.isEmpty());
        System.out.println(s1.peek());
        System.out.println(s1.search(10));
        s1.pop();
        System.out.println(s1);
    }
}
