package com.company;
import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    static Scanner scb = new Scanner(System.in);
    static String account;
    static int balance;

    public static   void main(String[] args) {



        // write your code here


        System.out.println();

        // int bukhari = 90;
        // int muslim = 80;
        //int nasai = 96;
        //int abu_dawud = 60;
        // int tirmiji = 90;
        // int bukhari2 = 80;
        // int muslim2 = 97;
        // int thawi = 80;
        //  int ibne_maja = 90;
        //you have earned"+sum/6);

       /* String personName = "ali";
        String laName = "Akbar";
      personName =  personName.toLowerCase(Locale.ROOT);
      laName = laName.toUpperCase(Locale.ROOT);
      String fullName = personName + laName;
        System.out.println(fullName);*/

//        boolean isWarm = false;
//        boolean isCold = false;
//        if (isWarm){
//            System.out.println("Today is too hot ");
//        }
//        else {
//            System.out.println("Today is too cold");
//        }
//        boolean haveMoney = false;
//        boolean haveWisdom = false;
//        boolean haveManner = false;
//        boolean haveTelant = false;
//
//        int Star = 1;
//
//
//
//        if (Star> 0 && Star<=5);{
//
//            if (Star<=2){
//                System.out.println("Report us the problam");
//            }
//            System.out.println("Thank you for your feedback.");
//        }
//        if (haveMoney){
//            System.out.println("You can easily servive with \"MONY\"");
//        }
//        else if (haveWisdom){
//            System.out.println("You can easily servive with \"Wisdom\"");
//        }
//        else if (haveManner){
//            System.out.println("You can easily servive with \"good MANNER\"");
//        }
//        else if (haveTelant){
//            System.out.println("You can easily servive with \"TELENT\"");
//        }
//        else {
//            System.out.println(" Though you don\'t have \"MONY\",\"Wisdom\",\"MANNER\",\"TELENT\". You are going to fall in trouble in the case of serviving in this earth ");
//        }

//

//        int month = 56; // should be a number 1-12
//        String monthString = "January" ;
//
//        switch(month) {
//            case 1: monthString = "January";
//                break;
//            case 2: monthString = "February";
//                break;
//            case 3: monthString = "March";
//                break;
//            case 4: monthString = "April";
//                break;
//            case 5: monthString = "May";
//                break;
//            case 6: monthString = "June";
//                break;
//            case 7: monthString = "July";
//                break;
//            case 8: monthString = "August";
//                break;
//            case 9: monthString = "September";
//                break;
//            case 10: monthString = "October";
//                break;
//            case 11: monthString = "November";
//                break;
//            // write case 12 and a default case below
//
//            case 12: monthString = "December";
//
//            break;
//
//            default:monthString = "OOps" + month + "is Not a Number Of Month";
//        }
//        System.out.println(monthString);


//

        int numberOfCoffee = 8;

        String messageForCustomer ;
        switch (numberOfCoffee) {
            case 2:
                messageForCustomer = "Thank you for your order";
                break;
            case 5:
                messageForCustomer = "Thank you hope you will enjoy our " + numberOfCoffee +" "+ "cups of coffe";
                break;
            case 10:
                messageForCustomer = "great job \tYou are our special customer enjoy our" + numberOfCoffee + "cups of coffe";
                break;
            default:
                messageForCustomer = "You ordered " +numberOfCoffee+"of coffe";
        }

        boolean isSnowing = false;
        boolean isRaining = false;
        double temperature = 30.0;


        if (isSnowing || isRaining || temperature < 50.0 ){
            if (isRaining){
                System.out.println("It's Raining");
            }
            else if (isSnowing) {
                System.out.println("It's Snowing");
            }
            else {
//                System.out.println("It's too cold");
            }
//            System.out.println("Don't go outsite");
        }
        else {
//            System.out.println("Let's go out side");
        }
        /*@Array Of String
        *
        * String[] newsChannel = { "BBC","CNN","ABC","Aljazira","sky","CBC","JamunaTV","SOMOY-TV","INDIPENDENT","G-TV"};

        int dice2 = rollDice2();
        *
        dice2 +=2;
        *
        System.out.println(newsChannel[dice2]);
        *
        */






//        double rendomN = Math.random();
//        rendomN = rendomN *6;
//
////        int rendomInt = (int) rendomN;
//        rendomInt = rendomInt + 1;
//        System.out.println(rendomInt);
//
//        double rendomInt =  ;
//        System.out.println();


//        System.out.println(rollDice());
//        System.out.println(rollDice2());
//        System.out.println(infiniteLoop(5));

//        int[] avarege = {34,56};
//        System.out.println(Avarege());
    }

    public static double Avarege (int[] averageNumber) {
        int size = averageNumber.length;

        double total = 0;

        for ( int i = 1; i <=averageNumber.length; i++) {

            total += averageNumber[i];

        }

        return total/size;
    }



    public static int rollDice(){
        double rendomN = Math.random();
        rendomN = rendomN * 6;

        int rendomInt = (int) rendomN;
        rendomInt = rendomInt + 1;
        return rendomInt;

    }
    public static int rollDice2(){
        double rendomN = Math.random();
        rendomN = rendomN * 6;

        int rendomInt = (int) rendomN;
        rendomInt = rendomInt + 1;
        return rendomInt;

    }


    int dice1 = rollDice();
    int dice2 = rollDice2();

    public static int infiniteLoop(int parametre) {
        int i;
        for (i = 1; i <= parametre; i++) {
            i = i - 1;
        }
        return i ;
    }







}


















