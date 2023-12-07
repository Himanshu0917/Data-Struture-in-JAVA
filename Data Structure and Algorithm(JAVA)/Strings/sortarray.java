import java.util.Scanner;
public class sortarray {
    public static void sot(int[] a)
    {
        int temp;
        for(int i =0;i<a.length;i++)
        {
            if(a[i]!=0)
        {
            for(int j = 0;j<a.length;j++)
            {
                temp = a[j];
               a[j] = a[i];
               a[i] = temp; 
            } 
        } 
        } 
        for(int k=a.length-1;k>=0;k--)
        {
            System.out.print(a[k]);
        }
    }
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of an array");
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i =0 ;i<n;i++)
        {
            a[i] = in.nextInt();
        }
        sot(a);
        in.close();

    }
    
}
