package Array;
import java.util.Scanner;
public class insertionsort {
    public static void sorting(int arr[])
    {

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
        in.close();
    }
}
