package com.lambton;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        Student s1= null;
        int a = 100;
        int b = 0;
        int c;
        String name="HELLO";
        Student s = new Student(1,"Komaldeep Kaur");
        int x[] ={1,2,3};
        System.out.println("START");
        try
        {
            System.out.println(s1.toString());
           //int x[4] = 1000;
            c = a / b;
            System.out.println("C: " + c);

            if(b != 10)
            {
                throw new ArithmeticException("Don't divide by 10");
            }
            if(name.length() < 10)
            {
                throw new ArithmeticException("Name must have length == 10 character");
            }
        }

     catch(ArithmeticException ae)
        {
            System.out.println(ae.toString());
           // System.out.println("value of b =0 , Divisible by zero error");
        }
        catch(ArrayIndexOutOfBoundsException acb)
        {
            System.out.println("Array x is trying access index not available");
        }

        catch(Exception ae)
        {
            System.out.println(ae.toString());
        }
        finally
        {
            System.out.println("i am in finally block");
        }
        System.out.println("END");

       // s1= null;
        //System.gc();
        try
        {
            s1.display();
        }
        catch(NameLengthException e)
        {
            e.printStackTrace();
        }

    }

}
