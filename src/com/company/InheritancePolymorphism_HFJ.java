package com.company;

import java.util.ArrayList;

public class InheritancePolymorphism_HFJ {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "Kedi";
        cat.noise = " MeoMeo";
        cat.food = " cat food";
    /*
     * this will run the method in Doggy Class . not the one in Animal class
     * [Because Lowest one wins] /the nearest one on the inheritance tree will be executed;
     * */

        cat.makeNoise();
        cat.eat();

        /*
        * multi level inheritance
        * */

        Squirrel squirrel = new Squirrel();
        squirrel.name = "কাঠবিড়ালী";
        squirrel.noise = "কাঠি কাঠি";
/*
* this will run the method in Doggy Class . not the one in Animal class
* [Because Lowest one wins] /nearest one on the inheritance tree will be executed;
* */
        squirrel.makeNoise();

/*TODO example of polymorphism
* This is the best way of use polymorphism
* */
        System.out.println("------------------------------Example of Polymorphism");
        /*TODO assigning object of subclass type to the reference of superclass type
        * */
        Animal[] animals ={ new Doggy(),new Cat(),new Squirrel()};
        String[] name = {new String("Doggy"), new String("Cutey"),new String("squirrel")};
        String[] noise = {new String("Goe Goe"), new String(" MeoMeo"),new String("squi ")};

        for (int i = 0; i < animals.length; i++) {
            animals[i].name = name[i];
            animals[i].noise = noise[i];
            animals[i].makeNoise();
        }
/*
* TODO Example of polymorphism in method argument */
        System.out.println("------------------------------Example of Polymorphism in method argument");

        Cow cow = new Cow();
        cow.shot(cat);

        /*
        * TODO we can pass [cat] object as argument of method shot();.
        *  because cat is a subclass of Animal object
        *  on the other hand we can't pass [buffalo] as argument of the method shot();
        *  because buffalo didn't extend the Animal class so it is not a subclass of Animal class  */

        Buffalo buffalo = new Buffalo();
       /*TODO we will get error if we run this [cow.shot(buffalo)];*/

        System.out.println("------------------------------Example of Method Overloading");

        MethodOverLoading methodOverLoading = new MethodOverLoading();
        methodOverLoading.printAnyTypeNumber(5);
        methodOverLoading.printAnyTypeNumber(5f);
        methodOverLoading.printAnyTypeNumber(5.9);


    }
}

 class Animal {

    String food ;
    String noise;
    String name;

   public void makeNoise() {
        System.out.println(name+" makes nose "+noise);
    }

   public void eat() {
        System.out.println(name +" eats "+food);
    }

}

 class Doggy extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("(Overriden in Doggy class) " + name+" makes noise "+noise);
    }
}

class Cat extends Doggy {


}

class Squirrel extends Cat {

}

class Cow {
    public void shot(Animal a) {
        a.makeNoise();
    }
}

class Buffalo {

}

class MethodOverLoading {

    void printAnyTypeNumber(int number) {
        System.out.println("printing int number "+number);
    }
    void printAnyTypeNumber(float number) {
        System.out.println("printing float number "+number);
    }
    void printAnyTypeNumber(double number) {
        System.out.println("printing double number "+number);
    }


}

class ObjectInfo {
    ArrayList<Object> doggies = new ArrayList<>(2);

    void experiment() {
    Doggy d = new Doggy();
        doggies.add(d);
        /*TODO we know that "get(0)" is a Doggy object ,but still we can't store it in d1 variable  which is a
        reference of Doggy type object .
        main reason is in an ArrayList<Object> objects come in as  Dog , Fox,Cow, Cat and so on type object.
        but they go out
         as only type of Object.because of that we can't store it in a Doggy type reference.
         but we can assign it in an (Object)[-capital O] type reference.
         we also can store it in a Doggy type reference by casting Doggy object.
        */

         //  TODO <code>Doggy d1 = doggies.get(0);</code>



        /*
        * will not get error because (d) is going out as a Object type even though it came in as Doggy */
        Object o = doggies.get(0);
        /*TODO
        * even though we can store Doggy variable <code> doggies.get(0)</code> in Object type reference
        * (o) .  we can't access Doggy's variable and methods . it can only access  methods that
        * The Doggy class has by inheriting the Object class . for example equals(),hashCode(),getClass() methods  */

        Doggy d2 =(Doggy) doggies.get(0);
            /*checking if the casting is done with right object*/
        if (o instanceof Doggy) {
            Doggy d3 =(Doggy) doggies.get(0);
        }

    }

}




