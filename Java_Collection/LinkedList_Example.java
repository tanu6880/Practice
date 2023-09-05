package Java_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Example {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(10);
        list1.add(1,20);
        list2.add(30);
        list2.add(1,40);
        list1.addAll(list2);
        list1.addAll(1,list2);
        list2.addFirst(100);
        list2.addLast(2000);
        list1.clear();
        System.out.println(list2.contains(40));
        System.out.println(list2.element());
        System.out.println(list2.get(1));
        System.out.println(list2.getFirst());
        System.out.println(list2.getLast());
        System.out.println(list2.indexOf(20));
        System.out.println(list2.lastIndexOf(30));
        list1.offer(10);
        System.out.println(list2.peek());
        System.out.println(list2.poll());
        System.out.println(list2.pop());
        list1.push(20);
        list1.set(1,300);
        System.out.println(list1.size()+" "+list2.size());
        System.out.println(list2);
        System.out.println(list1);

        Iterator<Integer> num = list2.iterator();
        while (num.hasNext())
        {
            System.out.print(num.next()+" ");
        }
        System.out.println();
        for(int i=0;i<list2.size();i++)
        {
            System.out.print(list2.get(i)+" ");
        }
        System.out.println();
        for (Integer number : list2
             ) {
            System.out.print(number+" ");
        }



    }
}
