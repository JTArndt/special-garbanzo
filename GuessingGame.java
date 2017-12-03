/** Program: Guessing Game
 * File: GuessingGame: GuessingGame.java
 * Summary: Generates a random number that the user must guess.
 * Author: Jacob Arndt
 * Date: 11/30/17
 * */
package programmingExercise3;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        int number = (int)(Math.random() * 10001);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a guess between 1 - 10000:");
        
        int guess = -1;
        int guesses = 0;
        int min = 1;
        int max = 10000;
        while (guess != number) {
            guess = input.nextInt();
            guesses++;
           
            if (guess == number) 
                System.out.println("You Win!  It took you " + guesses + " guesses.");
            else if (guess < number)
            {
                min = guess + 1;
                System.out.println("Higher.");
                System.out.println("Enter a guess between " + min + " and " + max );

            } 
            else 
            {
                max = guess - 1;
                System.out.println("Lower.");
                System.out.println("Enter a guess between " + min + " and " + max + ":");

            }
        }

    }

}
