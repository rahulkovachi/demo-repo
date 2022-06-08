import java.util.*;
public class J
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(s);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b)
            System.out.print("b is greater than a: " + b + " " + a);
        else
            System.out.print("a is greater than b: " + b + " " + a);


        System.out.println("\nEnter size of array ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter element of  array ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
        Arrays.sort(ar);
        System.out.println();
        for (int i:ar)
            System.out.print(i);
    }
}


