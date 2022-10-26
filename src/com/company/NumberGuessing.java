package com.company;

import java.util.Scanner;

public class NumberGuessing  extends Main{


    public static void main(String[] args) {
        account = "just for testing";
        balance =8;
        boolean haswon = false;
        Scanner sc = new Scanner(System.in);
       int randomNum = (int) (Math.random()*100)+1;
        for (int i = 10;i >0;i--){
            System.out.println("I have a secreate Number Guesss It");
            System.out.println("You have only "+i+" turn left");
            int guess = scb.nextInt();

//            if (guess==guess){
//                System.out.println("Enter Another Number");
//
//            }
            if (guess<randomNum){
                System.out.println("It is greater than " +guess);
            }
            else if (guess>randomNum){
                System.out.println("It is smaller than " +guess);
            }
            else {
               haswon = true;
               break;
            }
        }
        if (haswon){
            System.out.println("You won!! Great Job!!");
        }
        else {
            System.out.println("oops you loss");
            System.out.println("the number was "+randomNum);
        }
    }
}