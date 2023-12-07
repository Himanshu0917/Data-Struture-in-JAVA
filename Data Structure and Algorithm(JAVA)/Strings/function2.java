import java.util.Scanner;
public class function2 {
    public static boolean prime(int n){
        boolean a =true;
        for(int i=2;i<n;i++){
          
            if(n%i==0){
                a = false;
                break;
            }
            else{
                a =true;
            }

        }
        return a;

    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = prime(n);
        System.out.println(ans);
    }
}
