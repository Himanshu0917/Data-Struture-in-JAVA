import java.util.*;
public class stringpal {
    public static String rev(String str)
    {String b = "";
     for(int i=str.length()-1;i>=0;i--)
     {
        b= b+str.charAt(i);
    
     }
     return b;
    }
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("ENTER THE STRING");
        str = in.nextLine();
        String a = rev(str) ;
       for(int i=0;i<str.length();i++)
       {
        if(a.charAt(i)!=str.charAt(i))
        {
        System.out.println("False");
        break;
        }
        else{
            System.out.println("True");
            break;
        }
    }

    }
}
