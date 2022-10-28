package com.company;

import java.util.Scanner;

public class Static_HFJ_chpr10 {

        int j;
        Integer i=8;
    /*todo// if we make size variable non-static we will get an error and can't use it in main method
       because static methods only use static variable , You can't refer a non-static variable from a static method  */
    private static int size;

    public static void main(String[] args) {

        System.out.println("number is " + size);

        System.out.println(".....example of 1 static variable per class not per instances of class");
        test[] tests = {new test(), new test(),new test(),new test()};
        System.out.println(test.duckCount);

        System.out.println("example of string format with multiple argument");

        String s = String.format("the rank is %,d out of %,.2f", 5200, 120000.859);
        System.out.println(s);


        Static_HFJ_chpr10 chpr10 = new Static_HFJ_chpr10();
        chpr10.go();
        chpr10.convertingStringToBoolean();
    }

    void convertingStringToBoolean() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" you are married ?");
        System.out.println("type only \"True\" or \"False\" ");
        boolean b = Boolean.parseBoolean(sc.next());
        if (b) {
            System.out.println("you are married ");
        }else System.out.println("you are single ");

        /*String s = String.format("%,6.2f", 42.000);
        System.out.println(s);*/
    }

    void go() {
        // TODO:Wrapper Class 10/23/2022 /* wrapper classes don't have a default value
        //  like primitives so we will get errors if we don't assign a value to 'i' Integer the wrapper class*/
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}

/*todo //Static variables are shared.
        All instances of the same class share a single copy of the static variables.
        instance variables: 1 per instance ||static variables: 1 per class*/

class test {
    static int duckCount;
    static final int x = 4;
    /*todo //static initializer*/
    static {
        duckCount = 0;
    }

    public test() {
        duckCount++;
        System.out.println("test no " + duckCount);
    }
}
/* TODO: 10/23/2022
    1-A final variable means you can’t change its value.
    2-A final method means you can’t override the method.
    3-A final class means you can’t extend the class (i.e. you can’t make a subclass). */
