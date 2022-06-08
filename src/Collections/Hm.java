package Collections;
import java.util.HashMap;
import java.util.Map;
public class Hm
{
    public static void main(String[] args) {
        System.out.println("\n"+"For HashMap");
        HashMap<String,Integer> mp=new HashMap();
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
    }
}
