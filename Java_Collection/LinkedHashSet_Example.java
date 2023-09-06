package Java_Collection;

import java.util.LinkedHashSet;

public class LinkedHashSet_Example {
    public static void main(String[] args) {
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);

        System.out.println(ls);
        System.out.println(ls.size());
        System.out.println(ls.remove(2));
        System.out.println(ls.isEmpty());

        LinkedHashSet<Integer> clone = (LinkedHashSet<Integer>) ls.clone();
        System.out.println(clone);
        System.out.println(ls.contains(4));

        for (Integer num : ls
             ) {
            System.out.print(num+" ");
        }

    }
}
