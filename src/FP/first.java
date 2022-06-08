package FP;
import java.util.*;
public class first
{
     static void print(ArrayList<String>s)
     {
         for(String c:s)
         {
             System.out.print(c+" ");
         }
     }
    static void print1(ArrayList<String>s)
    {
        s.stream().forEach(e-> System.out.print(e+" "));
    }
    public static void main(String[] args)
    {
        ArrayList<String> s=new ArrayList<String>(Arrays.asList("Rahul","Ram","Sam"));
        System.out.println((s));
         print(s); // simple
        System.out.println();
         print(s);  // using functional Programming
    }
}
