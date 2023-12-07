package Array;
import java.util.*;
public class mergesorted {
    public static int[] merge(int arr1[], int arr2[])
    {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]>arr2[j])
                min  = arr2[i];
            }
        }
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
        System.out.println("enetr the elements of first array");
        for(int i = 0;i<arr1.length;i++)
        {
            arr1[i] = in.nextInt();
        }
        System.out.println("enter elemets of second array");
        for(int j = 0;j<arr2.length;j++)
        {
            arr2[j] = in.nextInt();
        }
        int arr3[] = merge(arr1,arr2);
        System.out.println("final sorted meged array is: ");
        for(int k=0;k>arr3.length;k++)
        {
        System.out.println(arr3[k]);
        }
        in.close();
    }

}
