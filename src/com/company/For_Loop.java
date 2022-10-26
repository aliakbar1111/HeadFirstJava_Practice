package com.company;

public class For_Loop extends Main{

    public static   void main(String [] args ){
        account = String.valueOf(67);
        balance = 67;
        System.out.println(account);
//        System.out.println(for_Loop(10));
//        System.out.println(for_Loop1(10));
//        System.out.println(for_Loop2(1));
//        System.out.println(for_Loop3(100));
//        int [] smallNumber = {5,34,56 ,56,1,768,43,23,12,89,0 };
//        System.out.println(findSmallNumber(smallNumber));
//        String [] names = {"AliAkbar","SumiAkterMunni","AyanAhmedRahi" ,"AryanAhmedMahi","JolyAkterLiza","AkbarAli","AliAsgar","Doliakter", };
//        System.out.println(longestName(names));

       


    }

    /**
     *
     * @param names names you want to find out their length
     * @return longest name all names [String[]names]
     */


    public static String longestName(String[] names){
        int size = names.length;
        String loName = names[0];
        for (int i=1; i<size ; i++){
            if (names[i].length()>loName.length()){
                loName = names[i];
            }

        }
        return loName;



    }


    
    public static int findSmallNumber (int[] speed) {
        int size = speed.length;
        int mini =speed[0];

        for ( int i = 1; i < size; i++) {
            if (speed[i]<mini){

                mini = speed[i];
            }

        }

        return mini;
    }
    
    public static int for_Loop(int price){
        for (int in = 1;in <=price; in++)
            System.out.println("warning # " + in);
        return price;
    }

    /**
     *
     * @param LevelOfBlock is level of blocks whose number of blocks  we want to know
     * @return ??
     */
    public static int for_Loop1(int LevelOfBlock){
        for (int in = 1; in <=LevelOfBlock;  in++)
            System.out.println(in*in);
        return LevelOfBlock;
    }

    public static int for_Loop2(int decrease){
        for (int i = 5; i >=decrease;i--)
            System.out.println(i);
        return decrease;
    }
    public static int for_Loop3(int decrease){
        for (int i = 2; i <= decrease; i+=2)
            System.out.println(i);
        return decrease;
    }
    



}
