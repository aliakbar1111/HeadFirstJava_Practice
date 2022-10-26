package com.company;

public class Array_of_obj_HFJ {


}
  class Triangle {
  static   double area;
  static   int height;
  static   int length;

      public static void setArea (){
          area = (double)  (height*length)/2;
      }
    public static void main (String[] args){

        Triangle[] ta = new Triangle[4];


        int x = 0;
        while (x<4){

            ta[x] = new Triangle();

            ta[x].height = (x+1)*2;

            ta[x].length = x+4;

            ta[x].setArea();

            System.out.print("Traingle "+x+", area ");
            System.out.println("="+ta[x].area);
            x+=1;
        }

        int y = x;

        x = 27;

        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = "+ t5.area);



        //TODO  -[Heap First Java]- page = 66 Chapter = 3//
        int k = 0;

        HeapQuiz [] hq = new HeapQuiz[6];
        while ( k <= 5 ) {

            hq[k] = new HeapQuiz();
            hq[k].id = k;

            if (k==1){

                hq[1].id=10;

            }


            System.out.println("Loop Result = "+hq[k].id);

            k += 1;
        }


        hq[4] = hq[1];
        hq[3] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];

        //TODO  = Value of Index "hq[1]" is from loop , Not from List above;

        System.out.println(hq[1].id);
        System.out.println(hq[4].id);
        System.out.println(hq[3].id);


    }

}
class HeapQuiz{
    int id = 0;
}
