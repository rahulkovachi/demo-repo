import java.util.*;
public class Collections
{
    public static void main(String[] args)
    {
        // ArrayLIst
        System.out.println("For ArrayList");
        ArrayList<Integer> a=new ArrayList();
        // add element in arraylist
        a.add(16);
        a.add(14);
        a.add(1,9);
        // traversing in arrayList;
        System.out.println(a);
         for(int i:a)
           System.out.print(i+" ");
        //Remove Element
         a.remove(1) ; // index no.
         System.out.println("\n"+a.get(1));
         a.set(1,78);
        for(int i=0;i<a.size();i++)
            System.out.print(a.get(i)+" ");
          a.clear(); // delete entire element


        // LinkedList
        System.out.println("\n"+"For LinkedList");
          LinkedList<Integer>l=new LinkedList();
          // adding
           l.add(2);
           l.add(4);
           l.addFirst(13);
           l.addLast(45);
         System.out.println(l);
        l.remove();
        l.remove(2);
        //Traversing
        System.out.println(l.get(1));
        for(int i:l)
            System.out.print(i+" ");


        //HashMap
           System.out.println("\n"+"For HashMap");
           HashMap<String,Integer>mp=new HashMap();
           mp.put("Rahul",1);
           mp.put("Ram",2);
           mp.put("Sam",3);
           System.out.println(mp);
           mp.put("Ram",6); // changing the value;
           mp.remove("Sam"); //removing ;
        for(Map.Entry<String,Integer>e:mp.entrySet())
             System.out.println(e.getKey()+" "+e.getValue());
         if(mp.containsKey("Sam"))
              System.out.println("YES");
         else
              System.out.println("Not Found");


         // HashSet
             System.out.println("\n"+"For Hashset");
             HashSet<Integer>s=new HashSet();
             s.add(1);
             s.add(17);
             s.add(14);
             s.add(1);
             for(int i:s)
                 System.out.print(i+" ");
             System.out.println();
             s.remove(1);
            s.forEach(k->System.out.print(k+" "));

         // TreeSet
        System.out.println("For TreeSet");
            TreeSet<Integer> ts=new TreeSet<>();
            ts.add(34);
            ts.add(12);
            ts.add(78);
            ts.add(23);
            ts.add(3);
            for(int i:ts)
                System.out.print(i+" ");
        }
}
