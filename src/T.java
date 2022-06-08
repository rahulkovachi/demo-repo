import Todo.F;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class T
{
    public static void main(String[] args)
    {
        /*Scanner sc= new Scanner(System.in);
         int t=sc.nextInt();
         for(int k=1;k<=t;k++)
         {
             String s=sc.next();
             String c=sc.next();
             int n=s.length(),m=c.length(),j=m-1;
             for(int i=n-1;i>=0;i--)
             {
                if(j>=0 && s.charAt(i)==c.charAt(j))
                {
                    System.out.print(s.charAt(i)+" ");
                    System.out.print(c.charAt(j)+" ");
                    System.out.println();
                    j--;
                }
             }
             if(j==-1)
                 System.out.println("YES");
             else
                 System.out.println("NO");
         }*/
       // System.out.println(list.of(1,2,3).stream());
        /*static class Pair implements Comparable<F.Pair>
        {
            int y;
            String s;
            public Pair(int y,String s) {
                this.y=y;
                this.s = s;
            }
            public int compareTo(F.Pair o) {
                return new Integer(this.y).compareTo(o.y);
            }
            public String toString()
            {
                return y+" "+s;
            }
        }
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String c[]=s.split(" ");
            HashMap<String,Integer> mp=new HashMap<>();
            for(String i: c)
            {
                if(mp.containsKey(i))
                    mp.put(i,mp.get(i)+1);
                else
                    mp.put(i,1);
            }
            ArrayList<F.Pair> a=new ArrayList<F.Pair>();
            for(Map.Entry<String,Integer> e:mp.entrySet())
            {
                a.add(new F.Pair(e.getValue(),e.getKey()));
            }
            Collections.sort(a,Collections.reverseOrder());
            for(F.Pair i:a)
            {
                System.out.println(i.y+" "+i.s);
            }
        }*/

    }
}

