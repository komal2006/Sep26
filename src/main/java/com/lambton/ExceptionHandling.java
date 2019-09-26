package com.lambton;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        int a = 100;
        int b = 10;
        int c;
        int x[] = {1,2,3};
        System.out.println("START");
        try
        {
           x[4] = 1000;
            c = a / b;
        }
       /* catch(ArithmeticException ae)
        {
            System.out.println("value of b =0 , Divisible by zero error");
        }
        catch(ArrayIndexOutOfBoundsException acb)
        {
            System.out.println("Array x is trying access index not available");
        }*/

        catch(Exception ae)
        {
            System.out.println(ae.toString());
        }
        System.out.println("END");
    }
}
