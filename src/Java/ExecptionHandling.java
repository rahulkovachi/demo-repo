package Java;

import javax.management.RuntimeErrorException;

public class ExecptionHandling {

    public static void main(String[] args)
    {
        /*try {
            int a[] = {1, 2};
            int x = a[2];
        }
        catch (Exception ex)
        {
            System.out.println("Exception");
            ex.printStackTrace();
        }*/
        int i=10;
        if(i<19)
            throw new ArithmeticException("Less");
        else
            System.out.println("fine");
    }
}