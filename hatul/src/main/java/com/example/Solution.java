package com.example;

import java.util.Scanner;

public class Solution{

    public static void task01(){

        // automatikus lezárása a scannernek (nem kell a végén scan.close)
        try(Scanner sc = new Scanner(System.in)){
            
            //blokk
            int num = 0;
            do{

                System.out.print("Szám: ");
                String numStr = sc.nextLine();
                num = Integer.parseInt(numStr);

            } while(num != 0);

        }
    }
    public static void task02(){

        int[] a = {1,2,3,4,5};
        // for each, lista bejárása
        for(int num : a){

            System.out.println(num);
        }
    }
}