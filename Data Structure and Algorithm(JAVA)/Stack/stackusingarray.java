package Stack;

public class stackusingarray {
    private int top;
    private int data[];
    public stackusingarray()
    {
        data = new int[10];
        top=-1;
    }
    public stackusingarray(int capacity)
    {
        data = new int[capacity];
        top =-1;
    }
    public boolean isempty()
    {
        // if(top==-1)
        // {
        //     return true;
        // }else{
        //     return false;
        // }
        // Both ways are same
        return(top==-1);

    }
    public int size()
    {
        return top+1;
    }
    public int top() throws stackemptyexception
    {
        if(size()==0){
            //stackemptyexception
            stackemptyexception e = new stackemptyexception();
            throw e;
        }
        return data[top];
    }
    public void push(int element) throws stackfullexception
    {
        if(size() == data.length)
        {
            // stack is full cant insert
            stackfullexception e = new stackfullexception();
            throw e;
        }
        top++;
        data[top]  = element;
    }
    public int pop() throws stackemptyexception
    {
        if(size()==0){
            stackemptyexception e = new stackemptyexception();
            throw e;
                     }
    int temp = data[top];
    top--;
    return temp;
    }
}
