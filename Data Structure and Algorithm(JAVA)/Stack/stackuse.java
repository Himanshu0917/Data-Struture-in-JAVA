package Stack;
import java.util.Stack;
public class stackuse {
    public static void main(String args[]) throws stackfullexception
    {
        stackusingarray stack = new stackusingarray();
        for(int i=1;i <=5;i++)
        {
            stack.push(i);
        }
        while(!stack.isempty())
        {
            try{
                System.out.println(stack.pop());
            } catch (stackemptyexception e)
            {
                //never raech here
            }
        }

    }
}
