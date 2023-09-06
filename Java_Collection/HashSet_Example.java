package Java_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);

        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.remove(50));

        HashSet<Integer>  clone = (HashSet<Integer>) hs.clone();
        System.out.println(clone);

        Iterator<Integer> itr = hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        hs.clear();
        System.out.println(hs.isEmpty());
    }
}
