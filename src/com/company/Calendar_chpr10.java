package com.company;

import java.util.Calendar;
import java.util.Locale;

public class Calendar_chpr10 {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.set(2022, Calendar.FEBRUARY, 1);
        System.out.println(cal.getTime());
        cal.add(Calendar.DATE,3);
        System.out.println(cal.getTime());
        cal.add(Calendar.HOUR,4);
        cal.set(Calendar.MONTH,5);
        cal.roll(Calendar.DATE,30);
//        cal.roll(Calendar.MONTH,true);
        System.out.println(cal.getTime().getHours());
        System.out.println(cal.getTime());

        System.out.println("...................................");
        Calendar calendar = Calendar.getInstance();

        calendar.set(2022,0,5,5,15);

        System.out.println(calendar.getTime());
        long day1 = calendar.getTimeInMillis();

        /*adding one hour to the time*/
        /*hour in milliseconds*/
        day1+=1000*(60*60);
        System.out.println("Hour in milliseconds "+day1);
        calendar.setTimeInMillis(day1);
        System.out.println("new hour  "+calendar.get(Calendar.HOUR_OF_DAY));
        calendar.add(Calendar.DATE,34);
        System.out.println("add 35 days " +calendar.getTime());
        calendar.add(Calendar.MONTH,2);
        /*converting date to string*/
        String d =calendar.getTime().toString();

        System.out.println("adding two months "+calendar.getTime() );
        System.out.println(d);



    }
}
