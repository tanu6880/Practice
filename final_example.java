package org.example.practice;

final class box
{
    final String size = "24*45";
    // jisme final varaible me value assign ho gyi usme hame constructor me bhi reasign nhi kr sakte
    // agar sirf declare kiya hai to hame use initialse kar sakte hai constructor me sirf
    // final method ko overwite nhi kar skate
    // final class ko inheritate nhi kar sakte
    // koi bhi method ek sathnabstract or final nhi ho sakta
    // or contructor kbhi abstract or final nhi hote
    // final static varible act like as constant
    final String m;

    public box(String m)
    {
        this.m = m;
    }
    final void display()
    {
        System.out.println("This function can not overwrite");
        System.out.println(size);
        System.out.println(m);
    }
}
public class final_example {
    public static void main(String[] args) {
        box b1 = new box("achha abhi samj aaya");
        b1.display();
    }
}
