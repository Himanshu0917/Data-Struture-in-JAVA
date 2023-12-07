package Recursion;
import java.util.Scanner;
public class geometricsum {
    public static double findGeometricSum(int k){
        int a =k/2;
		if()
        return findGeometricSum(a/2);
	}
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        System.out.println(findGeometricSum(n));
        in.close();
    }
}
