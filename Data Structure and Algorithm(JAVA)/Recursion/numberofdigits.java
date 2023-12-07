package Recursion;
import java.util.Scanner;
public class numberofdigits {
    public static int count(int n) {
        if(n<10)
        {
            return 1;
        }
        return count(n/10)+1;
    }
    public static void main(String args[])
    {
        System.out.println("enter the number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(count(n));
        in.close();
    }
}
