package LinkedList;
import java.util.*;
public class insertnode {
   
    public static node<Integer> takeinput()
    {
        node<Integer> head = null, tail =null;
        Scanner in = new Scanner(System.in);
        int data = in.nextInt();
        while(data!=1)
        {
            node<Integer> newnode = new node<Integer>(data);
            if(head==null)
            {
                head  = newnode;
                tail = newnode;
            }
            else{
                tail.next = newnode;
                tail = tail.next;
            }
            data = in.nextInt();
        }
        return head;
    }
    public static void print(node<Integer> head)
    {
        node<Integer> temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static node<Integer> insert(node<Integer> head, int data, int pos)
    {
        node<Integer> newnode = new node<Integer>(data);
        int i=0;
        if(pos == 0)
        {
            newnode.next = head;
            return newnode;
        }
        node<Integer> temp = head;
        while(i<pos-1)
        {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        return head;

    }
    public static void main(String args[])
    {
        node<Integer> head = takeinput();
        head = insert(head,80,0);
        print(head);
    }

}
