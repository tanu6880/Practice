package Generics;

import java.util.ArrayList;
import java.util.List;

// Using bounded type parameter in a generic clas
public class generic_class<T extends Number> {

    private T value;

    public generic_class(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    // Upper Bounded Wildcard - Accepts any list of numbers or their subtypes
    public static double sumNumbers(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        // numbers.add(20); not handled
        return sum;
    }

    // Lower Bounded Wildcard - Accepts any list that can hold Integer or its superclasses
    public static void addIntegers(List<? super Integer> integers) {
        integers.add(42);
    }

    public static void main(String[] args) {
        generic_class g1 = new generic_class(1);
        generic_class g2 = new generic_class(2);
        // restrict for only number
       // generic_class g3 = new generic_class('a');

        List<Number> l1 = List.of(1,2,3,4,5);
        List<Number> l2 = List.of(1.1,1.2,3.1,4.1,5.1);
        List<Character> l3 = List.of('a','b','c');

        System.out.println(sumNumbers(l1));
        System.out.println(sumNumbers(l2));
        // sumNumbers(l3);restrict for only number

        List<Integer> l4 = new ArrayList<>();
        addIntegers(l4);
        System.out.println(l4);
        addIntegers(l4);
        System.out.println(l4);
        //addIntegers(l2); restrict for only Integer
        // addIntegers(l3); restrict for only Integer
    }
}
