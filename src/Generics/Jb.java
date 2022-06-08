package Generics;
import  Generics.J1;
public class Jb {
    public static void main(String[] args)
    {
        J1<String> l1 = new J1();
        l1.addElement("Ram");
        l1.addElement("Sam");
        String s=l1.get(0);
        System.out.println(s);

        J1<Integer> l2 = new J1();
        l2.addElement(5);
        l2.addElement(34);
        int x=l2.get(0);
        System.out.println(x);
    }
}
