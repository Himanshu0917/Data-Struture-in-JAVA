package Recursion;
import java.util.Scanner;

public class factorial{
    public static int fact(int n)
{
    if(n == 1)
    {
        return 1;
    }
    return fact(n-1)+n;
}
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = fact(n);
        System.out.println(ans);
        in.close();
    }
    
}
