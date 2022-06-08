import java.util.*;
public class firstjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       /* Vector<Integer>v=new Vector<Integer>();
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            v.add(b);
        }
        for(int i=0;i<v.size();i++)
             System.out.print(v.get(i)+" ");*/
        HashMap<Integer, Integer> mp = new HashMap();
        HashSet<Integer>s=new HashSet();
        Vector<Integer>ar=new Vector();
        int arr[]=new int[a];
     for (int i = 0; i < a; i++)
       {
            int b = sc.nextInt();
           // int c = sc.nextInt();
           //mp.put(b, c);
           s.add(b);
          // s.add(c);
           ar.add(b);
           //ar.add(c);
        }
        for(int i:s)
            System.out.println(i);
       for(int i:ar)
           System.out.println(i);
       ar.remove(2);
        for(int i:ar)
            System.out.println(i);
       /*
        System.out.println(mp.size());
        System.out.println(mp);
        for (Map.Entry e : mp.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        Iterator i=mp.entrySet().iterator();
        while(i.hasNext())
        {
            Map.Entry e=(Map.Entry)i.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
        mp.forEach((k,v)->System.out.println(k+" "+v));*/
    }
}