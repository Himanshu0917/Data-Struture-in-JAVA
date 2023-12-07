package Recursion;
import java.util.Scanner;
public class fibonacci {
    public static int repeat(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        return repeat(n-1)+repeat(n-2);
    }
    public static void main(String args[])
    {
        System.out.print("enter the number: ");
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(repeat(n));
        in.close();
    }
    
}
