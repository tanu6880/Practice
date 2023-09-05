package Java_Collection;

import java.util.ListIterator;
import java.util.Vector;

public class Vector_class_example {

    public static void main(String[] args) {
        Vector myvector = new Vector<>();
        myvector.add(10);
        System.out.println(myvector);
        myvector.addElement(20);
        myvector.addElement(30);
        System.out.println(myvector);
        System.out.println(myvector.get(0));
        System.out.println(myvector.elementAt(1));
        System.out.println(myvector.lastElement());
        System.out.println(myvector.isEmpty());

        ListIterator<Integer> num = myvector.listIterator();
        while(num.hasNext())
        {
            System.out.println(num.next());
        }


    }
}
