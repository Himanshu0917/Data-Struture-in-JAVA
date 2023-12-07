import java.util.Scanner;
public class factorial {
    public static int fact(int n){
     int a = 1;
     for(int i=1;i<=n;i++)
     {
        a = a*i;
     }
     return a;
    }

    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int  n = in.nextInt();
        int r = in.nextInt();
        int num = fact(n);
        int den1 = fact(r);
        int den2 = fact(n-r);
        int ans = num/(den1*den2);
        System.out.println(ans);
    }
}
