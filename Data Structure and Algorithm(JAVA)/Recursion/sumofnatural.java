package Recursion;
import java.util.*;
public class sumofnatural {
    public static int power(int x,int n)
    {
        if(n==0)
        {
        return 1;
        }
        return  power(x,n-1)*x;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
		int n = s.nextInt();
		System.out.println(power(x, n));
        s.close();
    }
    
}
