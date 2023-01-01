package com.company;

public class AbstractClassAndMethod {
    public static void main(String[] args) {

        dogg dog1 = new dogg();
        dog1.name="dog";
        dog1.animalAbstractMethod();
        Catt catt = new Catt();

        /**
         * creating Animal list using Polymorphic argument;
         */
        AnimalList list = new AnimalList();
        /**
        our own add() method that can take any subtype or animal ;
        */
        list.add(dog1);
        list.add(catt);
    }
}

abstract class animal1 {
    String name;
    public abstract void animalAbstractMethod();
    public abstract void abstractMethod2(String name);
}

abstract class canine extends animal1 {

    public abstract void canineAbstractMethod();

    // TODO: 10/30/2022 implementation of the abstract method in animal superclass

    @Override
    public void animalAbstractMethod() {
        System.out.println("Animal name is " + name);
    }
}


class dogg extends canine {



     /*TODO: 10/30/2022 implementation of the abstract method in canine superclass
         animal abstract class has two abstract methods one is implemented by canine class so dogg class does not have to
         implement that method . remaining other abstract methods of animal class and one abstract method from canine
         class must be implemented by this class as it is the first concrete subclass in inheritance tree.otherwise we
         will get error.
           */
    @Override
    public void canineAbstractMethod() {
        System.out.println("ff");
    }


    @Override
    public void abstractMethod2(String name) {
        System.out.println("f");
    }

}


 class AnimalList {
     animal1[] animals = new animal1[5];
     int nextIndex = 1;

     void add(animal1 a) {
         if (nextIndex < animals.length) {
             animals[nextIndex] = a;
             System.out.println("animal added at index " + nextIndex);
             nextIndex++;
         }
     }
}
class Catt extends canine {
    /**
     *
     */
    @Override
    public void canineAbstractMethod() {

    }
    /**
     * @param name
     */
    @Override
    public void abstractMethod2(String name) {

    }

}

