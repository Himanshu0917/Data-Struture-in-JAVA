package Recursion;
import java.util.Scanner;
public class sumofdigits {
    public static int sum(int input)
    {
        return ans(input,0);
    }
    public static int ans(int input,int ans)
    {
        ans = input%10;
        if(input<10)
        { 
            return ans;
        }
        return sum(input/10)+ans;
    }
    public static void main(String args[])
    {
        System.out.println("enter the number: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(sum(input));
        in.close();
    }
}
