import java.util.*;
public class series {
    public static void main(String[] args) {
        int count =0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int equ;

        for(int i=1;i<=1000;i++)
        {
            equ = (3*i)+2;
            if((equ%4)!=0)
            {
                System.out.println(equ);
                count++;
            }
            if(count>=n)
            break;
        }
    
    }
}
