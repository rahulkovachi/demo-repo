package Collections;

import java.util.HashSet;

public class Hs
{
    public static void main(String[] args)
    {
        // HashSet
        System.out.println("\n"+"For Hashset");
        HashSet<Integer> s=new HashSet();
        s.add(1);
        s.add(17);
        s.add(14);
        s.add(1);
        for(int i:s)
            System.out.print(i+" ");
        System.out.println();
        s.remove(1);
        s.forEach(k->System.out.print(k+" "));
    }
}
