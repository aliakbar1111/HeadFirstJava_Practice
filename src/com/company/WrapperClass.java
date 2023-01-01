package com.company;

public class WrapperClass {
    public static void main(String[] args) {
        Integer integer = 7;

        takeBothIntAndInteger(integer);
    }
/*todo you can return an int from a method returning Integers and vice-versa */
    public Integer returnInteger() {
        int i = 5;
        return i;
    }

    static void takeBothIntAndInteger(int i) {
        System.out.println(i);
        float f = 2.0f;
        String s = Float.toString(f);
        System.out.println(s);
    }
}
