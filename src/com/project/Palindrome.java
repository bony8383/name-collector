package com.project;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word:");
        String str = sc.nextLine();

        boolean isPalindrom = true;
        int result = str.length();

        for(int i = 0; i < result / 2; i++){
            if(str.charAt(i) != str.charAt(result - 1 - i )){
                isPalindrom = false;
                break;
            }

            }
        if(isPalindrom){
            System.out.println(str  + " " + " is palindrome");
        }else{
            System.out.println(str + " " + "is not palindrome");
        }
        }

    }

