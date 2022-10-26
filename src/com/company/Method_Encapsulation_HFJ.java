package com.company;

import java.util.Scanner;

class Student {
    private String name;
    private int Id;


     public String getName() {
         return name;
     }

     public void setName(String n) {
         this.name = n;
         if (n.length()>10){
             throw new RuntimeException("Try smaller name ");
         }else if (n.length()<3){
             throw new RuntimeException("Try greater Name");
         }
     }

     public int getId() {
         return Id;
     }

     public void setId(int id) {
         if (id < 1) throw new RuntimeException("Enter a valid Student ID. ");
         Id = id;
     }
 }
public class Method_Encapsulation_HFJ {

    public static void main(String[] args){

        Student st1=new Student();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Your Name :");

        String stName = scanner.nextLine();
        st1.setName(stName);

        System.out.println("Enter Your ID :");

        int id=scanner.nextInt();
        st1.setId(id);

        System.out.println("Name : "+st1.getName());
        System.out.println("Student ID : "+st1.getId());
    }

}
