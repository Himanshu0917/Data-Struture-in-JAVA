package Array;
import java.util.Scanner;
public class bubblesort {
    public static void sorting(int arr[])
    {int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            { 
        
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
      for(int k=0;k<arr.length;k++)
       System.out.print(arr[k]);
    
    }
    public static void main(String []args)
    {
        Scanner in  = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = in.nextInt();
        }
        sorting(arr);
    
    }
}
