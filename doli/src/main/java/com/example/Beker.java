package com.example;

import java.util.Scanner;

public class Beker {

    public static void task01(){

        Integer[] osszPontszam = new Integer[5];
        int pont = -1;

        try(Scanner sc = new Scanner(System.in)){
            
            for(int i = 0; i < osszPontszam.length; i++){

                do{

                    System.out.printf("%d. feladatban elért pontszám: ", i + 1);
                    String pontStr = sc.nextLine();

                    try{pont = Integer.parseInt(pontStr);}
                    catch(Exception e){

                        System.err.println("Hibás adat! ez nem szám ");
                    }

                    if(pont < 0 || pont > 10){

                        System.err.println("Hibás adat! nem 0 és 10 között van a szám ");
                    }else{
                        
                        osszPontszam[i - 1] = pont;
                    }
                } while(pont < 0 || pont > 10);
            }
            int ossz = 0;
            for(int szam : osszPontszam){

                ossz += szam;
            }
            System.out.printf("Az elért összpontszám: %d pont \n", ossz); 

        }
    }
}

