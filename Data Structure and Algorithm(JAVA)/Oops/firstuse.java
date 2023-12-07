package Oops;
import java.util.Scanner;
public class firstuse {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        first f1 = new first("aniket", 123);
        System.out.println(f1);

        f1.print();
        first f2 = new first("najish",132);
        f2.print();
    }
}
 