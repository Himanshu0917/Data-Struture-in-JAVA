package Array;
import java.util.*;
public class slection_sort {
    public static void sorting(int arr[])
    {   int temp =0 ;

        int min =0;
     for(int i=0;i<arr.length-1;i++)
     {
        
        for(int j=i+1;j<arr.length;j++)
        { 
            min= arr[i];
            if(min>arr[j])
            {
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
          
        }
     }
      for(int k=0;k<arr.length;k++)
      {
     System.out.print(arr[k]+" ");
     }
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
