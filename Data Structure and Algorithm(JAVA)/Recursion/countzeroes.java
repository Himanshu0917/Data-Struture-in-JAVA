package Recursion;
import java.util.Scanner;
public class countzeroes {
    public static int countZerosRec(int input){
        int count= 0;
        count =  ans(input, 0);
		return count;
	}
    public static int ans(int input, int count)
    {
        if(input%10==0)
        {
            count++;
        }
        if(input>=10)
        {
        return countZerosRec(input/10);
        }
        
    }
    public static void main(String args[])
    {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        System.out.println(countZerosRec(n));
        in.close();
    }
}
