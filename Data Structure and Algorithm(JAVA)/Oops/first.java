package Oops;
public class first {
    public String name;
   private final int roll_no;
   static int numstud;
   public first(String name, int roll_no)
   {
   this.name  = name;
    this.roll_no = roll_no;
    numstud++;
   }
  
   public int getrollno()
   {
    return roll_no;
   }
   public void print()
   {
    System.out.println((name));
   }
    
}
