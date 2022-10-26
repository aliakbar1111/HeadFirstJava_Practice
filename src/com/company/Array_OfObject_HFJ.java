package com.company;

public class Array_OfObject_HFJ {

}

class Books {
    String title;
    String author;
}

class Hobbits {
    String name;
}

class BooksTestDrive {

    public static void main(String[] args) {

/*
        Hobbits [] h = new Hobbits[3];

        int z = -1;

        while (z<2){

            z+=1;

           h[z] = new Hobbits();
           h[z].name="bilbo";
           if (z==1)h[z].name="frodo";
           if (z==2)h[z].name="sam";

            System.out.print(h[z].name+" is a ");
            System.out.println("godd Hobbits ");

        }*/

        String[] island = new String[4];
        island[0] = "Bermuda";
        island[1] = "Fiji";
        island[2] = "Azores";
        island[3] = "Cozumel";

        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;

        while (y < 4) {

            ref = index[y];
            System.out.print("island =");
            System.out.println(" " + island[index[y]]);
            //TODO (OR)
            /*System.out.println(" "+island[ref]);*/

            y += 1;
        }


        Books[] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        int x = 3;

        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";
        while (x >= 0) {
            if (x == 3) x -= 1;
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x - 1;

        }
    }
}
