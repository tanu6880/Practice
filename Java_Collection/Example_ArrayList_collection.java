package Java_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Example_ArrayList_collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1,40);
        for(int i=0;i<10;i++)
        {
            list.add((i+1)*10);
        }
        System.out.println(list);
        System.out.println(list.size());
        list.remove(10);
        System.out.println(list);
        System.out.println(list.indexOf(100));
        System.out.println(list.lastIndexOf(10));
        System.out.println(list.contains(100));
        System.out.println(list.set(0,1000));

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        for(Integer num : list)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        //using iterator
        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}
