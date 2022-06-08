package Collections;

import java.util.LinkedList;

public class Llist
{
    public static void main(String[] args) {
        // LinkedList
        System.out.println("\n"+"For LinkedList");
        LinkedList<Integer> l=new LinkedList();
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
    }
}

