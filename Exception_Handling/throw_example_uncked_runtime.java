package Exception_Handling;

public class throw_example_uncked_runtime {
    // yh condition hoti hai ki jab aap us nhi karna chahte throw ko or aapki exception uncked hai to yh isealy throw se bhi handle ho jati hai kyoki runtimeerrroe parant hai
    public static void devide(int a,int b)
    {
        if(b==0)
        {
            throw new RuntimeException("b 0 nhi ho sakta");
        }
        else
        {
            System.out.println("ab dono ka devide hoga : "+a/b);
        }
    }

    public static void main(String[] args) {
        devide(6,0);
    }
}
