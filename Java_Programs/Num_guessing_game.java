package org.example;
import java.util.Scanner;
import java.util.Random;

public class num_guessing {
    public static void main(String [] args){
        int tries = 0;
        System.out.println("Number Guessing Game - By Taha");

        Scanner sc = new Scanner(System.in);

        Random randomm = new Random();
        int comp = randomm.nextInt(100)+1;
        System.out.println(comp);

        System.out.println("Enter Number");
        int n = sc.nextInt();

        if (n < comp) {
            System.out.println("Enter Higher Number");
            tries+=1;

        }
        else if(n> comp){
            System.out.println("Enter Lower Number");
            tries+=1;
        }

        else if (comp == n){
            System.out.println("Number Guessed");
            tries+=1;
            System.out.println("Tries: "+ tries);
        }
        
    }
}
