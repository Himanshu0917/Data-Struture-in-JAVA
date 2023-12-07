package Recursion;
import java.util.Scanner;
public class sortedarray {
    public static boolean ans(int input[])
    {
        if(input.length<=1)
        {
            return true;
        }
       int  smallinput[] = new int[input.length-1];
       for(int i=1;i<input.length;i++)
       {
        smallinput[i-1] = input[i];
       }
       boolean s = ans(smallinput);
       if(!s)
       {
        return false;
       }
       if(input[0]<=input[1])
       {
        return true;
       }
       else
       return false;

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
        System.out.println(ans(input));
        in.close();
    }

    
}
