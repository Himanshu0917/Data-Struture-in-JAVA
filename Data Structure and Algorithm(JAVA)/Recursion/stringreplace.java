package Recursion;
import java.util.Scanner;
public class stringreplace {
    public static String replace(String input){
		int n = input.length()-1;
        int start;
        if(start == n)
        {
            return input;
        }
    }
    public static void main(String args[])
    {
        String input;
        Scanner in = new Scanner(System.in);
        input = in.next();
        System.out.println(replace(input));   
        in.close();
    }
}
