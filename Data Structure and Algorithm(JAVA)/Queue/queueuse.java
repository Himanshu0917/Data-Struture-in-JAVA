package Queue;
import java.util.*;
public class queueuse {
    public static void main(String args[]) {
        // queueusingarray queue = new queueusingarray();
        // for(int i=1;i<=5;i++)
        // {
        //     try{
        //     queue.enqueue(i);
        // } catch(queuefullexception e)
        // {

        // }
        // }
        // while(!queue.isempty())
        // {
        //     try{
        //         System.out.println(queue.dequeue());
        //     } catch(queueemptyexception e)
        //         {
        //             //TODO Auto-generated catch block
        //             e.printStackTrace();
        //         }
                 
        //     }
        // }
        void fun(int n)
    {
        queueusingarray q = new queueusingarray();
        q.enqueue(0);
        q.enqueue(1);       
    for (int i = 0; i < n; i++)
    {
        int a = q.dequeue();
        int b = q.dequeue();
        q.enqueue(b);
        q.enqueue(a + b);
        System.out.print(a);
    }

    }
}

