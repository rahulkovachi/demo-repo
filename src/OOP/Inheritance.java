package OOP;
class base
{
    protected void print()
    {
        System.out.println("this is base");
    }
}
class child extends base
{
    public void print1()
    {
        System.out.println("this is child");
    }
    protected void print2()
    {
        System.out.println("this is child 1");
    }
}

public class Inheritance
{
    public static void main(String[] args)
    {
         child a=new child();
         a.print1();
         a.print2();
         a.print();
    }
}
