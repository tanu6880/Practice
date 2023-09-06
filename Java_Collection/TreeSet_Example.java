package Java_Collection;

import java.util.TreeSet;

public class TreeSet_Example {
    public static void main(String[] args) {
        TreeSet<Integer>  t1 = new TreeSet<>();
        t1.add(10);
        t1.add(20);
        t1.add(11);
        t1.add(13);

        System.out.println(t1);
        System.out.println(t1.ceiling(11));
        System.out.println(t1.floor(11));
        System.out.println(t1.higher(11));
        System.out.println(t1.lower(11));

        System.out.println(t1.size());
    }
}
