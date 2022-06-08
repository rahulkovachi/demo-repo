package OOP;

// Java Program for Method Overriding
class Parent
{

    void Print()
    {
        System.out.println("parent class");
    }
}

class subclass1 extends Parent {

    void Print() { System.out.println("subclass1"); }
}

class subclass2 extends Parent {

    void Print()
    {

        System.out.println("subclass2");
    }
}
public class poly1
{
     public static void main(String[]args)
    {
          Parent obj=new Parent();
          obj.Print();
          obj=new subclass1();
          obj.Print();
          obj=new subclass2();
          obj.Print();
    }
}