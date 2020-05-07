package org.example.time;

import java.util.Date;

public class MyTest {

    public static void main(String[] args) throws InterruptedException {

        Date d1 = new Date();
        Thread.sleep(1000);
        Date d2 = new Date();
        System.out.println("d2 after d1 : " + d2.after(d1));
        System.out.println("d1 before d2: " +  d1.before(d2));
        System.out.println("d1 compareTo d2 : " + d1.compareTo(d2));
        System.out.println("d1 equals d2 : " + d1.equals(d2));
        System.out.println("d1 toString : " + d1.toString());
        System.out.println("-----------------------------------------------");
    }



}
