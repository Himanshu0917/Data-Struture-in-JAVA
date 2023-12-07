package Recursion;
import java.util.Scanner;
public class replace {
   /*  public static String removeString(String input, char c1, char c2){
        String str = "";
        if(input.length() ==0)
        {
            return input;
        }
        if(input.charAt(0)!=c1)
        {
            str = str + input.charAt(0);
        }
        String ans = removeString(input.substring(1),c1,c2);
        return str + ans;

    }*/
    public static String replaceString(String input,char c1,char c2){
    String str = "";
    if(input.length()==0)
    {
        return input;
    }
    if(input.charAt(0)!=c1){
        str = str+input.charAt(0);
    }
    if(input.charAt(0)==c2){
           str = str+'x';
    }
    String ans  = replaceString(input.substring(1), c1, c2);
    return str +ans;
    }
    public static void main(String args[])
    {
        System.out.println("enetr the string");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println("enetr the char to be relpaced: ");
        char c1 = in.next().charAt(0);
        System.out.println("enter the value of the replaced value: ");
        char c2 = in.next().charAt(0);
        System.out.println(replaceString(input, c1, c2));
        in.close();
    }
    
}
