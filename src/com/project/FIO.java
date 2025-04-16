package com.project;

import java.util.Scanner;

public class FIO {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        System.out.println( "Atyn kim?" );
        String aty = sc.nextLine();

        System.out.println( "Familian kim?" );
        String familia = sc.nextLine();


        System.out.println( "Privet, " + aty + " " + familia );
    }
}