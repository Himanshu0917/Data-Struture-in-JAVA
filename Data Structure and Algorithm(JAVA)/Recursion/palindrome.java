package Recursion;
import java.util.Scanner;
public class palindrome {
    public static boolean check(String str){
        int n = str.length() - 1;
        return ans(str, 0, n);
    }
        public static boolean ans(String str, int startindex, int endindex){
             if(startindex >= endindex)
             {
                  return true;
             }
            if(str.charAt(startindex)!=str.charAt(endindex))
                {
                return false;
                }   
                return ans(str,startindex+1,endindex-1);
           }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str;
        str = in.next();
        System.out.println(check(str));
        in.close();

    }
}
