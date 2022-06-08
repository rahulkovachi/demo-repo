package Generics;
import java.util.ArrayList;
import java.util.List;
public class J3
{
    static<X extends List>void duplicate(X List)
   {
       List.addAll(List);
    }
    public static void main(String[] args)
    {
        List<Integer> a =new ArrayList<>(List.of(1,2,3));
        duplicate(a);
        System.out.println(a);
    }
}
