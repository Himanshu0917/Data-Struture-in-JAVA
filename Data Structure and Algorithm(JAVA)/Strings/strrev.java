import java.util.*;
public class strrev {
    public static String reverse(String str)
    { String b = "";
       for(int i=str.length()-1;i>=0;i--)
       {
         
          b=b+ str.charAt(i);
       }
       return b;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
     
        System.out.println("enetr the string");
        String str;
    
        str = in.nextLine();
        in.close();
       String a=  reverse(str);
       System.out.println(a);
    }
}
