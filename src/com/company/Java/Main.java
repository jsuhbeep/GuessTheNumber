package com.company.Java;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static int randNum(){
        return (int) (Math.random() * 19 + 1);
    }
    public static String intro(){
        return "Hello! What is your name?";
    }
    public static String getName(){
        return input.next();
    }
    public static String start() {
        return "I am thinking of a number between 1 and 20. \n Take a guess.";
    }
    public static int getGuess(){
        return input.nextInt();
    }

    public static void playing() {
        System.out.println(intro());
        String name = getName();
        System.out.println("Well, " + name + start());
        Boolean playing = new Boolean(true);
        while (playing) {
            Boolean guessing = new Boolean(true);
            int random = randNum();
            int tries = 0;
            while (guessing) {
                int guess = getGuess();
                try {
                    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
                    int opt = arr[guess - 1];
                } catch (Exception e) {
                    System.out.println("Remember to input a number between 1 and 20 next time.");
                }
                if (guess > random) {
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
            playing = continuing();
        }
        System.out.println("Thank you for playing Guess the Number!");
    }

    public static Boolean continuing() {
        System.out.println("Would you like to play again? (y or n)");
        char reply = input.next().charAt(0);
        try {
            if (reply == 'n') {
                return false;
            } else if (reply == 'y') {
                System.out.println(start());
                return true;
            }
        } catch (Exception E) {
            System.out.println("Error: something went wrong with the continuation. Ending the game.");
        }
        System.out.println("The response was not an option. Ending the game.");
        return false;
    }

    public static void main(String[] args) {
        playing();
    }
}
