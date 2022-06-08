package Collections;
import java.util.ArrayList;
public class AList
{
    public static void main(String[] args) {

        // ArrayLIst
        System.out.println("For ArrayList");
        ArrayList<Integer> a = new ArrayList();
        // add element in arraylist
        a.add(16);
        a.add(14);
        a.add(1, 9);
        // traversing in arrayList;
        System.out.println(a);
        for (int i : a)
            System.out.print(i + " ");
        //Remove Element
        a.remove(1); // index no.
        System.out.println("\n" + a.get(1));
        a.set(1, 78);
        for (int i = 0; i < a.size(); i++)
            System.out.print(a.get(i) + " ");
        a.clear(); // delete entire element
    }
}
