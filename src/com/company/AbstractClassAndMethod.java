package com.company;

public class AbstractClassAndMethod {
    public static void main(String[] args) {
        dog dog1 = new dog();
        dog1.name="dog";
        dog1.animalAbstractMethod();
    }
}

abstract class animal {
    String name;
    public abstract void animalAbstractMethod();
    public abstract void abstractMethod2(String name);

}

abstract class canine extends animal {

    public abstract void canineAbstractMethod();

    // TODO: 10/30/2022 implementation of the abstract method in animal superclass




    @Override
    public void animalAbstractMethod() {
        System.out.println("Animal name is " + name);
    }
}

class dog extends canine {



     /*TODO: 10/30/2022 implementation of the abstract method in canine superclass
         animal abstract class has two abstract methods one is implemented by canine class so dog class does not have to
         implement that method . remaining other abstract method of animal class and one abstract method from canine
         class must be implemented by this class as it is the first concrete subclass in inheritance tree.otherwise we
         will get error.
           */
    @Override
    public void canineAbstractMethod() {

    }


    @Override
    public void abstractMethod2(String name) {

    }

}

