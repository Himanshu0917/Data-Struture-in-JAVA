package Oops;

public class car extends vehicle {
  /*   int numgears;
    boolean isconvertible;
    public void printcar()
    {
        System.out.println("Car colour: "+colour);
        System.out.println("Car topspeed: "+maxspeed);
        System.out.println("Car numgears: "+numgears);
        System.out.println("Car isconvertible: "+isconvertible);
        
    }*/
    //void print()
    //{
      //  System.out.print("Car class");
    //}
    public static void main(String args[])
    {
      //  vehicle v = new vehicle();
    //}
    vehicle v = new vehicle();
    v.colour = "white";
    v.set(1010) ;
    System.out.println(v.colour + " " + v.get());
}
}

