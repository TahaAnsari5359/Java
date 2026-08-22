package org.example;
import java.util.Scanner;
import java.util.Random;

public class num_guessing {
    static Random randomm = new Random();
    static int comp = randomm.nextInt(100) + 1;


    public static void guess_func() {
        int tries = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int n = sc.nextInt();

        if (n < comp) {
            System.out.println("Enter Higher Number");
            tries+=1;
            guess_func();  

        } else if (n > comp) {
            System.out.println("Enter Lower Number");
            tries+=1;
            guess_func();  

        } else {
            System.out.println("Number Guessed!");
            tries+=1;
            System.out.println("Tries: " + tries);

        }

    }
    
    public static void main(String[] args) {
        System.out.println("Number Guessing Game - By Taha");
        guess_func();
        
    }
}
