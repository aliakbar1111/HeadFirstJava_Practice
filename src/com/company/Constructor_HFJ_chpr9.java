package com.company;

public class Constructor_HFJ_chpr9 {

    public static void main(String[] args) {
    Duck duck = new Duck("Ali");
    /* you can pass argument in this constructor , you can also use the non-arg constructor*/

    Mini mini = new Mini("Tesla ",34);

    }

    public Constructor_HFJ_chpr9() {
        System.out.println("this is from main class ");
    }
    /*TODO overloaded constructor*/
    public Constructor_HFJ_chpr9(String name) {
        System.out.println("this is from main class "+"\nname is "+name);
    }


}

class Duck extends Constructor_HFJ_chpr9 {

    public Duck(String name) {
        /*TODO //calling the super class constructor manually*/
        super(name);
        System.out.println("this is from duck class");
    }
}

class car {
    String name;
    int size;

    public car(String name, int size) {
        this.size = size;
        this.name = name;
        System.out.println("car name is "+ name+" size is "+size);
    }
}

class Mini extends car{

    String type;
    /*TODO this is Real Constructor and do all the construction stuff including call to super()*/
    public Mini(String name, int size) {
        super(name, size);
        type = "Mini";
        System.out.println("type is "+type);
    }

    /*this is overloaded construction to handle exceptions */
    public Mini() {
        /*calling the real construction from this construction*/
        this(" tata nano ", 32);
    }
}


