package com.company;


public class Constructor_HFJ_chtpr9 {

 String name;

    public static void main(String[] args) {

    Duck duck = new Duck("Kak");

    /* you can pass argument in this constructor , you can also use the non-arg constructor*/

//    Mini mini = new Mini("Tesla ",34);
    Mini mini1 = new Mini();
    }

    public Constructor_HFJ_chtpr9() {
        System.out.println("this is from main class ");
    }
    /*TODO overloaded constructor*/
    public Constructor_HFJ_chtpr9(String name) {
        System.out.println("this is from main class "+" name is "+name);
    }


}

class Duck extends Constructor_HFJ_chtpr9 {


    public Duck(String name) {
        /*TODO //calling the super class constructor manually . (arged constructor)*/
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
    /*TODO this is The Real Constructor and do all the construction stuff including call to super()*/
    public Mini(String name, int size) {
        super(name, size);
        type = "Mini";
        System.out.println("type is "+type);
    }

    /*this is overloaded constructor to handle exceptions (if anyone doesn't pass anything to it , we provide a default value to it)*/
    public Mini() {
        /*calling The Real Constructor from this Constructor.
        * It will do what The Real Constructor does including call to super();W
        */
        this("tata nano ", 32);
        /*By _this("tata nano ", 32)_ we are passing a default value to our The Real Constructor ,
        so anyone can use this constructor even if he does not pass anything to it.*/
        /*we will have all the code that are in  The Real Constructor . though we didn't write it
        *
        * in our case if we call this no-arg constructor we will have the code line below;
         type = "Mini";
         System.out.println("type is "+type);
        * */
    }

}



