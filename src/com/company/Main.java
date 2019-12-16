package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //  1  2  3  4   5   6    "Patlu"
        //  2  4  6  8  10  12    "Motu"

        Scanner sc = new Scanner(System.in);
        System.out.println(" Insert the number of bricks : ");
        int nr = sc.nextInt();
        int ramase = nr;
        int x=0, y=0;

        for (int i=1; i<=nr ; i++){
            x = x + i;        // Patlu
            y = y + i*2;      // Motu
            ramase = ramase - i - i*2;  // cate caramizi au ramas nepuse

            /* daca nr caramizilor puse pana acum nu depaseste nr de caramizi date , iar nr de caramizi ramase < i ,
             inseamna ca vor fi puse la prima actiune ,deci de catre Patlu*/

            if ( x + y < nr && ramase < i){
                System.out.println("Patlu");
                System.exit(0);
            }
        }
        System.out.println("Motu");
    }
}
