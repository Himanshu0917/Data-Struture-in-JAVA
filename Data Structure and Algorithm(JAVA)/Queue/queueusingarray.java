package Queue;

public class queueusingarray <T>{
    
    private int front = -1;
    private int rear = -1;
    private int data[];
    private int size;
    public queueusingarray()
    {
        data = new int[10];
        front = -1;
        rear = -1;
        size =0;
    }
    public queueusingarray(int capacity)
    {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size =0;
    }
    int size()
    {
        return size;
    }
    boolean isempty()
    {
        return size==0;
    }
    int front() throws queueemptyexception
    {
        if(size==0)
        {
            throw new queueemptyexception();
        }
        return data[front];
    }
    void enqueue(int element) throws queuefullexception
    {
        if(size == data.length)
        {
            throw new queuefullexception();
        }
        if(size==0)
        {
            front =0;
        }
        size++;
        rear = (rear+1)%data.length;
        data[rear] = element;
    }
    int dequeue() throws queueemptyexception
    {
        if(size==0)
        {
            throw new queueemptyexception();
        }
        int temp = data[front];
        size--;
        front  = (front+1)%data.length;
        if(size == 0)
        {
            front =-1;
            rear  = -1;
        }
        return temp;
    }
}
