package Todo;
import java.util.*;
public class F
{
    static class Pair implements Comparable<Pair>
    {
        int y;
        String s;
        public Pair(int y,String s) {
            this.y=y;
            this.s = s;
        }
        public int compareTo(Pair o) {
            return new Integer(this.y).compareTo(o.y);
        }

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String c[]=s.split(" ");
        HashMap<String,Integer>mp=new HashMap<>();
        for(String i: c)
        {
         if(mp.containsKey(i))
             mp.put(i,mp.get(i)+1);
         else
             mp.put(i,1);
        }
        ArrayList<Pair>a=new ArrayList<Pair>();
        for(Map.Entry<String,Integer> e:mp.entrySet())
        {
            a.add(new Pair(e.getValue(),e.getKey()));
        }
       Collections.sort(a,Collections.reverseOrder());
        int k=0;
        for(Pair i:a)
        {
            System.out.println(i.y+" "+i.s);
            k++;
            if(k==3)
                break;
        }
    }

}
