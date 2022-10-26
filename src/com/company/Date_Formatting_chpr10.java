package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Date;

public class Date_Formatting_chpr10 {

    public static void main(String[] args) {
/*todo //  printing full date and time*/
        Date today = new Date();
        String s = String.format("%tc", today);
        System.out.println(s);

        /*todo //  printing  Time only*/
        String s1 = String.format("%tr", today);
        System.out.println(s1);
        /*todo //  printing day of the week, month and date*/
        //  tA for Day || tB for Month || td for Date

        String s2 = String.format("%tA, %tB %td", today,today,today);
        System.out.println(s2);
        /* TODO: the short form of above code is below.
            if you want to avoid repeating argument, below format is for you
              The angle-bracket “<” is just another flag in the specifier
              that tells the formatter to “use the previous argument again".*/
        
        String s4 = String.format("%tA, %<tB %<td", today);
        System.out.println(s4);

        String s3 = String.format("%tD", today);
//       output will be  { 10/25/22 }
        System.out.println(s3);

    }
}
