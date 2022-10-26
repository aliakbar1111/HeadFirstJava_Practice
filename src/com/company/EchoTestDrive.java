package com.company;

import java.util.Arrays;

public class EchoTestDrive {

    String name;

    public static void main(String[] args) {



        /*
         //TODO 1
        Practice of Array of Object
        *
         */
       /* EchoTestDrive EchoTestDrive1 = new EchoTestDrive();
        EchoTestDrive1.bark();
        EchoTestDrive1.name = "Bart";
        // now make a EchoTestDrive array
        EchoTestDrive[] myEchoTestDrives = new EchoTestDrive[3];
        // and put some EchoTestDrives in it
        myEchoTestDrives[0] = new EchoTestDrive();
        myEchoTestDrives[1] = new EchoTestDrive();
        myEchoTestDrives[2] = EchoTestDrive1;
        // now access the EchoTestDrives using the array
        // references
        myEchoTestDrives[0].name = "Fred";
        myEchoTestDrives[1].name = "Marge";

        // Hmmmm... what is myEchoTestDrives[2] name?
        System.out.print("last Dog’s name is ");
        System.out.println(myEchoTestDrives[2].name);
        // now loop through the array
        // and tell all EchoTestDrives to bark
        int x = 0;
        while (x < myEchoTestDrives.length) {
            myEchoTestDrives[x].bark();
            x = x + 1;
        }*/



        /*
        //TODO 2
        Initialize Random value to Array
         */
        /*int[] myRandomArray = new int[10];

        for (int i = 0; i < myRandomArray.length; i++) {
            myRandomArray[i] = (int) (Math.random() * 10);

        }
        System.out.println("Random Arrays are : " + Arrays.toString(myRandomArray));*/




           /* int[] myIntArray = { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32 };
            System.out.println("Original Array " + Arrays.toString(myIntArray));
            // Reverse Array
            int temp;
            int ArraySize = myIntArray.length;
            for (int i = 0; i < (ArraySize / 2); i++) {
                temp = myIntArray[i];
                myIntArray[i] = myIntArray[ArraySize - (i + 1)];
                myIntArray[ArraySize - (i + 1)] = temp;


            }
            System.out.println("Reversed Array " + Arrays.toString(myIntArray));*/


        Echo e1 = new Echo();
        Echo e2 = new Echo();

        int y = 0;

        while (y < 4) {
            e1.hallo();
            e1.$count = e1.$count + 1;

            if (y < 3) {
                e2.$count = e2.$count + 1;
            }
            if (y > 1) {
                e2.$count = e2.$count + e1.$count;
            }
            y = y + 1;
        }
        System.out.println(e2.$count);
    }

    public void bark() {
        System.out.println(name + " says Ruff!");
    }
}



class Echo {
    int $count = 0;
    void hallo(){
        System.out.println( "helloooo...");
    }
}

