package Array;
import java.util.Scanner;
public class finding {
    public static void binarysearch(int[] a,int key)
    {
        int mid = a.length/2;
        if(a[mid]==key)
        {
        System.out.println("True");
        }
        else if(key<a[0]||key>a[a.length])
        {
        System.out.println("Key not found");
        }
      else  if(key>a[mid])
        {
         for(int i=mid+1;i<a.length;i++)
         {
            if(a[i]==key)
            System.out.println("Key Found");
         }
        }
        else if(key<a[mid])
        {
            for(int j=0;j<mid;j++)
            {
                if(a[j]==key)
                System.out.println("KEY FOUND");
            }
        }
    }
    public static int[] sorting(int[] arr)
    {
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {   int temp = 0;
                if(arr[i]>arr[j])
                {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                }
            }
        }
        return arr;
    }
     
    public static void main(String []args)
    {
        Scanner in  = new Scanner(System.in);
        int n;
        int key;
        System.out.println("Enter the key to search");
        key = in.nextInt();
        System.out.println("Enter the size of the array");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = in.nextInt();
        }
        int a[] =sorting(arr);
        for(int i = 0;i<a.length;i++)
        System.out.print(a[i]+" ");
        System.out.println();
        binarysearch(a,key);
        in.close();
    }
}


