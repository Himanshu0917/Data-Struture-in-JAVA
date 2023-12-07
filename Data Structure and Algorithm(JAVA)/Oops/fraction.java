package Oops;

public class fraction {
    private int numerator;
    private int denominator;
    public fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        if(denominator == 0)
        {
            // TODO error out
        }
        this.denominator  = denominator;
        simplify();
    }
    public int getdenominator()
    {
        return denominator;
    }
    public int getnumerator()
    {
        return numerator;
    }
    public void setnumerator(int n)
    {
        this.numerator = n;
        simplify();
    }
    public void setdenominator(int d)
    {
        if(d==0)
        {
            //TODO error out
            return;
        }
        this.denominator = d;
        simplify();
    }
    public void print()
    {
        if(denominator==1)
        {
            System.out.println(numerator);
        }
        else{
            System.out.println(numerator+"/"+denominator);
        }
    }
    private void simplify()
    {
        int gcd =1;
        int smaller = Math.min(numerator, denominator);
        for(int i=2;i<=smaller;i++)
        {
            if(numerator%i==0 && denominator%i ==0)
            {
                gcd =i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }
    public static fraction add(fraction f1, fraction f2)
    {
        int newNum = f1.numerator *f2.denominator + f2.numerator * f1.denominator;
        int newDen = f1.denominator * f2.denominator;
        fraction f = new fraction(newNum, newDen);
        return f;
    }
    public void add(fraction f2)
    {
        this.numerator = this.numerator * f2.denominator + this.denominator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }
    public void multiply(fraction f2)
    {
        this.numerator = this.numerator * f2.denominator;
        this.numerator = this.denominator * f2.denominator;
        simplify();
    }
}
