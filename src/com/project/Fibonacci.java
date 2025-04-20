package com.project;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Insert your number n:" );
        int number = sc.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 1; i <= number ; i++) {
            System.out.println( a);
            int c = a + b;
            a = b;
            b = c;



        }


    }


        }







