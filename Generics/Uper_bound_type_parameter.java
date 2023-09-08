package Generics;

import java.util.LinkedList;
import java.util.List;

public class Uper_bound_type_parameter {

    public static void uper_bound(List<? extends Number> numbers)
    {
        for (Number num: numbers
             ) {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6);
        List<Double> doubles = List.of(1.1,1.2,1.3,1.4,1.5);
        List<Character> characters = List.of('a','b','c');
        uper_bound(integers);
        uper_bound(doubles);
        //uper_bound(characters); restrict method only for numbers
        // Upper Bounded Wildcard - Accepts any list of numbers or their subtypes
    }
}
