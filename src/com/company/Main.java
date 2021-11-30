package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = input.nextLine();
        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20. \n Take a guess.");
        Boolean playing = new Boolean(true);
        while(playing){
            Boolean guessing = new Boolean(true);
            int random = (int) (Math.random() * 19 + 1);
            int tries = 0;
            while(guessing){
                int guess = (int) input.nextInt();
                try {
                    int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
                    int opt = arr[guess-1];
                } catch (Exception e) {
                    System.out.println("Remember to input a number between 1 and 20 next time.");
                }
                if(guess > random){
                    tries++;
                    System.out.println("Your guess is too high. \nTake a guess.");
                } else if (random > guess) {
                    tries++;
                    System.out.println("Your guess is too low. \nTake a guess.");
                } else if (random == guess) {
                    System.out.println("Good job, " + name + "! You guessed my number in " + tries + " guesses!");
                            guessing = false;
                }
            }
            System.out.println("Would you like to play again? (y or n)");
            char reply = input.next().charAt(0);
            try {
                if (reply == 'n') {
                    playing = false;
                } else if (reply == 'y') {
                    System.out.println("Well, " + name + ", I am thinking of a new number between 1 and 20. \n Take a guess.");
                }
            } catch (Exception e) {
                System.out.println("Error: the response was not an option. Ending the game.");
            }
        }
        System.out.println("Thank you for playing Guess the Number!");
    }
}
