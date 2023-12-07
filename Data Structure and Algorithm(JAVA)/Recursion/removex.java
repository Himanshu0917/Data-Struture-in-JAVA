package Recursion;
import java.util.Scanner;
public class removex {
    public static String removeX(String input){

        
        return removeX();
	}
    public static void main(String args[])
    {
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string: ");
        input = in.nextLine();
        System.out.println(removeX(input));
        in.close();
    }
    
}
