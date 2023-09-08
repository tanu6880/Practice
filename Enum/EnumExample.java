package Enum;

enum car
{

    lamborgini(900),
    tata(2),
    audi(50);

    private int price;
    car(int p)
    {
        price = p;
    }

    public int getPrice() {
        return price;
    }
}


public class EnumExample {

    public static void main(String[] args) {

        for (car c : car.values()
             ) {
            System.out.println(c+" Cost "+c.getPrice()+ " thousend doller");
        }
        System.out.println("Price of Lamborghini: $" + car.lamborgini.getPrice());
        System.out.println("Price of Tata: $" + car.tata.getPrice());
        System.out.println("Price of Audi: $" + car.audi.getPrice());

        enum session {WINTOR,SPRING,SUMMER,FALL};
        for (session s :session.values()
             ) {
            System.out.println(s);
        }
    }
}
