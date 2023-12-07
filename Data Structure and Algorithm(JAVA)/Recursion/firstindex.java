package Recursion;
import java.util.Scanner;
public class firstindex {
    public static int first(int input[],int x){
        return ans(input,x,0);
    }
    public static int ans(int input[],int x,int startindex){
        int n = input.length;
        if(startindex == n)
        {
            return -1;
        }
        if(x == input[startindex])
        {
            return startindex;
        }
        return ans(input,x,startindex+1);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("ENTER THE SIZE OF THE ARRAY: ");
        n = in.nextInt();
        int input[] = new int[n];
        System.out.println("enetr the array");
        for(int i = 0;i<n;i++){
            input[i] = in.nextInt();
        }
        System.out.println("ENTER THE VALUE OF X: ");
        int x = in.nextInt();
        System.out.println(first(input,x)) ;
        in.close();
    }
    
}
