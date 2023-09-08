package Generics;

public class GenericMethodTest {

    public static <T> void method(T[] inputArray)
    {
        for (T num: inputArray
             ) {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[] DoubleArray = {1.1,2.2,3.3,4.4};
        Character[] charArray = {'a','b','c','d','c'};

        method(intArray);
        method(DoubleArray);
        method(charArray);

    }
}
