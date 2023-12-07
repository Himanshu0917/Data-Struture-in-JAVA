package Oops;

public class fractionuse {
    public static void main(String args[])
    {
        fraction f1 = new fraction(20,30);
        f1.print();

        f1.setnumerator(12);
        int d = f1.getdenominator();
        System.out.println();
        f1.print();

        f1.setnumerator(10);
        f1.setdenominator(30);
        f1.print();

        fraction f2 = new fraction(3,4);
        f1.add(f2);
        f1.print();
        f2.print();

        fraction f3 = new fraction(4,5);
        f3.multiply(f2);
        f3.print();
        f2.print();

        fraction f4 = fraction.add(f1,f3);
        f1.print();
        f3.print();
        f4.print();
        

    }
}
