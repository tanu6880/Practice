package Generics;

import java.util.LinkedList;

public class Lower_bound {

    // Lower Bounded Wildcard - Accepts any list that can hold Number or its superclasses
    public static void lower_bound(LinkedList<? super Number> list)
    {
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
    }
    public static void main(String[] args) {
        LinkedList<Number> list = new LinkedList<>();
        lower_bound(list);
        System.out.println(list);
    }
}
