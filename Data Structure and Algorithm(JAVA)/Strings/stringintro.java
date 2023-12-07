import java.util.Scanner;
public class stringintro {
    public static void main(String []args)
    {
    // Scanner in = new Scanner(System.in);
    // String str = new String("abc");
    // String str1 = "abc";

    // System.out.print(str == str1);
    // in.close();
//     String str1="abc";
//     String str = "abc";
// String str2=new String("abc");
// System.out.println(str1==str2);
// System.out.println(str1==str);
// System.out.println(str);
//     }
// }

StringBuffer str1=new StringBuffer("");
for(int i=0;i<5;i++)
{
    str1.append((char)('a'+i));
}
System.out.println(str1);
    }
}