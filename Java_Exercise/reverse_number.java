package Java_Exercise;

public class reverse_number {
    public static void main(String[] args) {
        int num = 125646;
        int rev = 0;
        while(num!=0)
        {
            int m = num % 10;
            rev = rev*10 +m;
            num = num /10;
        }
        System.out.println(rev);
    }
}
