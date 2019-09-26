package com.lambton;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        int a = 100;
        int b = 0;
        int c;
        System.out.println("START");
        try
        {

            c = a / b;
        }
        catch(ArithmeticException ae)
        {
            System.out.println("value of b =0 , Divisible by zero error");
        }

        System.out.println("END");
    }
}
