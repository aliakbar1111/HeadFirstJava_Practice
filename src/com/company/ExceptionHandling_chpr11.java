package com.company;


public class ExceptionHandling_chpr11 {
/*todo// using something that cases exception but not handling it using try/catch what I am
   doing is  announce that I am using a risky thing whatever method calls me must
   either Handle  or Declare (Duck it)
* */
    void testException() throws ArithmeticException {
        int x = 5 / 0;
        System.out.println(x);

    }

    public static void main(String[] args)  {
        ExceptionHandling_chpr11 exceptionHandling = new ExceptionHandling_chpr11();
        try {
            exceptionHandling.testException();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");

        }
    }

}


