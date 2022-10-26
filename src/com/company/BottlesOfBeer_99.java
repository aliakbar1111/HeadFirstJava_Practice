package com.company;

public class BottlesOfBeer_99 {

    public static void main(String[] args) {

        String bottleOfBeer = " bottles of beer ";
        String onWall = "on the wall. ";
        String takeOne = "| Take one down and pass it around, ";
        for (int i = 99; i >= 1; i--) {
            if (i == 1) bottleOfBeer = " bottle of beer";
            System.out.println("| "+i + bottleOfBeer + onWall + i + bottleOfBeer+" |\n");
            i -= 1;


            System.out.print(takeOne);
            if (i == 1) bottleOfBeer = " bottle of beer";
            if (i == 0) {
                System.out.println("No more bottle " + onWall);
                System.out.println("\n\n |No more bottles of beer on the wall, no more bottles of beer. |\n ");
                System.out.println(" |Go to the store and buy some more, 99 bottles of beer on the wall. | ");
            } else {
                System.out.println(+i + bottleOfBeer + onWall+" |\n");
            }
            i += 1;
        }


// make three sets of words to choose from. Add your own!
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky",
                "value-added", "oriented", "centric", "distributed",
                "clustered", "branded", "outside-the-box", "positioned",
                "networked", "focused", "leveraged", "aligned",
                "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision",
                "paradigm", "mission"};
// find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
// generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
// now build a phrase
        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];
// print out the phrase
        System.out.println("What we need is a " + phrase);

        int x = 0;
        while ( x < 4 ) {
            System.out.print("a");
            if ( x < 1 ) {
                System.out.print("");
            }
            System.out.print("n");
            if ( x > 1 ) {

                System.out.print(" oyster");
                x = x + 2;
            }
            if ( x == 1 ) {
                System.out.print("noys");
            }
            if ( x < 1 ) {
                System.out.print("oise");
            }
            System.out.println("");
            x = x + 1;
        }
    }
}

