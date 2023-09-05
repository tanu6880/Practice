package Java_Collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeue_Example {
    public static void main(String[] args) {
        ArrayDeque<Character> ad = new ArrayDeque<>();
        ad.add('A');
        ad.add('B');
        ad.add('C');
        ad.add('D');
        ad.add('E');

        ad.addFirst('p');
        ad.addLast('z');
        ArrayDeque<Character> clone = ad.clone();
        System.out.println(clone);

        System.out.println(ad.contains('a'));
        System.out.println(ad.getFirst()+" "+ad.getLast());
        System.out.println(ad.isEmpty());

        Iterator<Character> itr = ad.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");

        }
        System.out.println(ad);
        ad.offer('e');
        ad.offerFirst('f');
        ad.offerLast('q');
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad);

        System.out.println(ad.pop());
        System.out.println(ad);
        System.out.println(ad.remove());
        System.out.println(ad);
        System.out.println(ad.removeFirst());
        System.out.println(ad);
        System.out.println(ad.removeFirstOccurrence('e'));
        System.out.println(ad);
        System.out.println(ad.removeLastOccurrence('a'));
        System.out.println(ad);

        System.out.println(ad.size());

    }
}
