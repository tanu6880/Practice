package org.example.practice;

interface father
{
    int gift=10;
    void gift();

}
interface mother
{
    void food();
    String food = "pizzza";
}
class son implements father,mother
{
    public void gift()
    {
        System.out.println("i found "+gift+" gift from father");
    }
    public void food()
    {
        System.out.println("i have had "+food+" from mother");
    }
}
public class Multiple_Inheritence_Interface {
    public static void main(String[] args) {

        son s1 = new son();
        s1.food();
        s1.gift();

    }
}
