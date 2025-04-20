package com.project;

import java.util.Scanner;

public class Frequency_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Insert your word:" );
        String word = sc.nextLine();


        for (int i = 0; i < word.length(); i++) {
            boolean isCounted = false;

            for (int k = 0; k < i; k++) {
                if (word.charAt(k ) == word.charAt(i)) {
                    isCounted = true;
                    break;
                }
            }
          if(isCounted){
              continue;
          }

          int count = 0;
          for(int j = 0; j < word.length(); j++){
              if(word.charAt( j ) == word.charAt( i )){
                  count++;
              }
          }
            System.out.println("Character: " + word.charAt( i ) + " - Frequency: "+ count);
        }

    }
}




