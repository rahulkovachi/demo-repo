package FP;
import java.util.ArrayList;
import java.util.Arrays;
public class Dop
{
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>(Arrays.asList("Rahul", "Ram", "Sam"));
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(78,30,7,29,16,9,45,7,16));
        System.out.println((s));
        s.stream().filter(e->e.endsWith("am")).forEach(e->System.out.print(e+" "));
        System.out.println();
        int p=a.stream().reduce(0,(n1,n2)->n1+n2);
        System.out.println(p);
        a.stream().filter(e->e%2==1).forEach(e->System.out.print(e+" "));
        System.out.println();
        a.stream().sorted().forEach(e->System.out.print(e+" "));
        System.out.println();
        a.stream().distinct().map(e->e*e).forEach(e->System.out.print(e+" "));
        System.out.println();
        System.out.println(a.stream().max((n1,n2)->Integer.compare(n1,n2)).get());
        //HashMap<String,k>
    }
}
