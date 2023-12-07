package Array;
import java.util.*;
public class sumoftwoarrays {

public static void sum(int arr1[], int arr2[])
{
    int arr[] = new int[arr1.length];
    int sum =0;
    int carry=0;
    int value=0;
    for(int i=arr1.length-1;i>=0;i--)
    {
        for(int j=arr2.length-1;j>=0;j--)
        {
            sum = arr[i]+arr[j];
            if(sum>=10)
            {
                carry = sum/10;
                value = sum%10;
                sum = value;
            }
            else
            {
                sum = arr[i]+arr[j];
            }
            
        }
    }
    System.out.println("sum of two array is: ");
    System.out.print(sum+" ");
}
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of first array");
        int n = in.nextInt();
        System.out.println("enter the size of the second array");
        int m = in.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        System.out.println("enter the elements of first array");
        for(int i = 0;i<arr1.length;i++)
        {
            arr1[i] = in.nextInt();
        }
        System.out.println("enter elemets of second array");
        for(int j = 0;j<arr2.length;j++)
        {
            arr2[j] = in.nextInt();
        }
        sum(arr1,arr2);
        
    }
}


