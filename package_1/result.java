package package_1;
import package_1.System_method.Math;

public class result {
    public static void main(String[] args) {

        Math m1 = new Math();
        System.out.println("Sum is : "+m1.add(1,2,3,4,5));
        System.out.println("max is : "+m1.max(1,2,3,4,5));
        System.out.println("min is : "+m1.min(1,2,3,4,5));
        System.out.println("mul is : "+m1.mul(1,2,3,4,5));
    }
}
