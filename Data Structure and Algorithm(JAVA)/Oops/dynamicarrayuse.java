package Oops;
public class dynamicarrayuse {
    public static void main(String args[]) {
        
    dynamicarray d = new dynamicarray();
    for(int i=0;i<100;i++)
    {
        d.add(i+10);
    }

    System.out.print(d.size());
    d.set(4,10);
    System.out.print(d.get(3));
    System.out.print(d.get(4));

    while(!d.isempty())
    {
        System.out.println(d.removelast());
        System.out.println("size = "+ d.size());
    }
}
}
