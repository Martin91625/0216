package com.example;

public class Array {

    public static void task01(){

        Integer[] szamok = new Integer[3];

        szamok[0] = 30;
        szamok[1] = 35;
        szamok[2] = 40;
        //szamok[3] = 45;        
        // ^ java.lang.ArrayIndexOutOfBoundsException

        for(Integer szam : szamok){
            System.out.printf("%d ",szam);
        }
        System.out.println();
    }
}
