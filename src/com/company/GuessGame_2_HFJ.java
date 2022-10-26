package com.company;

import java.util.Scanner;

public class GuessGame_2_HFJ {


    static class Player {

        int guess;


        public void guessp1() {
            Scanner input = new Scanner(System.in);
            System.out.print("Guess for 1st player ");
            guess = input.nextInt();
            System.out.println("I'm guessing " + guess);
        }

        public void guessp2() {
            Scanner input = new Scanner(System.in);
            System.out.print("Guess for 2nd player ");
            guess = input.nextInt();
            System.out.println("I'm guessing " + guess);
        }

        public void guessp3() {
            Scanner input = new Scanner(System.in);
            System.out.print("Guess for 3rd player ");
            guess = input.nextInt();
            System.out.println("I'm guessing " + guess);
        }

    }


    static class GuessGame {
        Player p1;
        Player p2;
        Player p3;

        public void startGame() {
            p1 = new Player();
            p2 = new Player();
            p3 = new Player();
            int guessP1 = 0;
            int guessP2 = 0;
            int guessP3 = 0;
            boolean p1IsRight = false;
            boolean p2IsRight = false;
            boolean p3IsRight = false;
            int targetNumber = (int) (Math.random() * 10);
            while (true) {
                System.out.println("The Number is to guess is \"HIDDEN!\"");

                p1.guessp1();
                p2.guessp2();
                p3.guessp3();

                guessP1 = p1.guess;
                guessP2 = p2.guess;
                guessP3 = p3.guess;

                System.out.println("Ayan Guessed " + guessP1);
                System.out.println("Arian Guessed " + guessP2);
                System.out.println("Ali akbar Guessed " + guessP3);


                if (guessP1 == targetNumber) {
                    p1IsRight = true;
                }

                if (guessP2 == targetNumber) {
                    p2IsRight = true;
                }

                if (guessP3 == targetNumber) {
                    p3IsRight = true;
                }

                if (p1IsRight || p2IsRight || p3IsRight) {
                    System.out.println("We have a winner");
                    System.out.println("Player one got it right? " + p1IsRight);
                    System.out.println("Player tow got it right? " + p2IsRight);
                    System.out.println("Player three got it right? " + p3IsRight);
                    System.out.println("Answer was " + targetNumber);
                    System.out.println("Game is over");
                    break;

                } else {
                    System.out.println("Guess again");
                }
            }


        }
    }

    static class GameLauncher {

        public static void main(String[] args) {

            GuessGame game = new GuessGame();
            game.startGame();
        }
    }

}
