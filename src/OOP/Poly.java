package OOP;
public class Poly
{
    static int mul(int a,int b) { // function Overloading
        return a * b;
    }
    static double mul(double a,double b) {
        return a * b;
    }
    public static void main(String[] args)
    {
        System.out.println(mul(12,7));
        System.out.println(mul(12.0,7.0));
    }
}
