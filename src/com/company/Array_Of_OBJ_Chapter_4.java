package com.company;

public class Array_Of_OBJ_Chapter_4 {

    public static void main(String[] args) {

        //TODO Instance variable of  "Dog" Class

        Dog one = new Dog();
        one.size = 70;
        Dog tow = new Dog();
        tow.size = 20;
        Dog three = new Dog();
        three.size = 10;

        one.bark();
        tow.bark();
        three.bark();

        //TODO Instance variable of  "DogLoverOrNot" Class

        DogLoverOrNot dogL1 = new DogLoverOrNot();
        dogL1.dogNumber = 1;
        dogL1.catNumber = 2;
        DogLoverOrNot dogL2 = new DogLoverOrNot();
        dogL2.catNumber = 1;
        dogL2.dogNumber = 2;
        DogLoverOrNot dogL3 = new DogLoverOrNot();
        dogL3.dogNumber = 1;
        dogL3.catNumber = 1;

        dogL1.whatYouLove();
        dogL2.whatYouLove();
        dogL3.whatYouLove();
    }
}

class Dog {

    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");

        } else System.out.println("Yip! Yip!");
    }
}

class DogLoverOrNot {

    //State of Object

    int dogNumber;
    int catNumber;
    String cetagory;

    //Behaveor of Object

    void whatYouLove() {
        if (dogNumber > catNumber) {
            cetagory = "You are a Dog lover! ";

        } else if (catNumber > dogNumber) {
            cetagory = "You are a Cat lover!";
        } else /*if (dogNumber==catNumber)*/cetagory = "You love both!";
        System.out.println(cetagory);
    }
}
