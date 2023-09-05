package Java_Collection;

import java.util.PriorityQueue;

public class PriorityQueue_Example {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Tanu") ;
        pq.add("Radha");
        pq.add("muskan");
        pq.add("purvi");

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.size());

        pq.offer("sumitra");
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq);

    }
}
