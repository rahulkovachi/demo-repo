package OOP;

public class cons
{
    int a,b;
    cons(int x,int y)
    {
        a=x;
        b=y;
    }
    public void  get()
    {
        System.out.println(a+" "+b);
    }
    public int sum(int x,int y,int z)
    {
        return (x+y+z);
    }
    public int sum(int x,int y)
    {
        return x+y;
    }
    public static void main(String[] args)
    {
        cons a=new cons(2,3);
        a.get();
        System.out.println(a.sum(4,5));
    }
}
