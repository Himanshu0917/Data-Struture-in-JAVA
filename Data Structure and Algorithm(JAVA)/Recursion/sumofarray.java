package Recursion;
import java.util.Scanner;
public class sumofarray {
    public static int sum(int input[],int n) {
        if(input.length==1)
        {
            return input[0];
        }
        int smallarray[] = new int[input.length-1];
        for(int i=1;i<input.length;i++)
        {
            smallarray[i-1] = input[i];
        }
        int ans = sum(smallarray,n-1);
        return ans+input[n];
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = in.nextInt();
        int input[] = new int[n];
        for(int i=0;i<n;i++)
        {
        input[i]=in.nextInt();
        }
        System.out.println(sum(input,n));
        in.close();
    }
}
