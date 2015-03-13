package nyc.c4q.m47bell;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by c4q-marbella on 3/11/15.
 * Access Code 2-1
 * Marbella Vidals
 */

public class Hangman {

    public static void main(String[] args) {
        //the answer of the game
        char playerAnswerLetter;

        //response if user wants to play
        String responsePlay;

        //the number of letters in the answer
        int numOfLetters = 6;

        char[] answer = {'m', 'a', 'r', 'b', 'e', 'l'};


        Scanner input = new Scanner(System.in);

        //print out game objective
        System.out.println("The objective of this game is to guess " +
                "this word by entering the correct letters in five rounds \n");

        //prompt user if they would like to play
        System.out.println("Would you like to play? (Y/N)");

        //save/retrieve response if they want to play
        responsePlay = input.nextLine();

        //decides whether to proceed with the game or not

        if (!(responsePlay.equalsIgnoreCase("Y") || (responsePlay.equalsIgnoreCase("N")))) {
            System.out.println("Please enter y for yes to play game or no to exit");

        } else if (responsePlay.equalsIgnoreCase("N")) {

            System.out.println("Exiting game. Good bye");
            System.exit(0);
        }
        //if responsePlay.equalsIgnoreCase("Y")
        else {

            System.out.println("Great, let's play!");

            //print out the number of letters in the game
            System.out.println(" This word has " + numOfLetters + " letters.\n");

            for (int round = 1; round <= 5; round++) {

                System.out.println("Round: " + round + "\nEnter a letter: ");
                String guess = input.next();
                playerAnswerLetter = guess.charAt(0);

                // guess a letter and if its the first letter correct....
                if (playerAnswerLetter == answer[0]) {

                    System.out.println("Great! You guessed the first letter correctly.");

                } else if (playerAnswerLetter == answer[1]) {//guess the second letter correct

                    System.out.println("Great! You guessed the second letter correctly.");

                } else if (playerAnswerLetter == answer[2]) { //guess the third letter correct

                    System.out.println("Great! You guessed the third letter correctly.");

                } else if (playerAnswerLetter == answer[3]) { //guess the fourth letter

                    System.out.println("Great! You guessed the third letter correctly.");

                } else if (playerAnswerLetter == answer[4]) { //guess the fourth letter

                    System.out.println("Great! You guessed the fourth letter correctly.");

                } else if (playerAnswerLetter == answer[5]) { //guess the fourth letter

                    System.out.println("Great! You guessed the fifth letter correctly.");
                } else {
                    // if ((playerAnswerLetter !== answer[0]|| playerAnswerLetter !== answer[1] || playerAnswerLetter !== answer[2]
                    // || playerAnswerLetter !== answer[3] || playerAnswerLetter !== answer[4] || playerAnswerLetter !== answer[5]) {

                    System.out.println("Oops..The letter you entered is not in the word. Try again\n");

                }
                if (round >= 5) {

                    System.out.println("Game over. Good Bye");

                    System.exit(0);

                } if (round <= 5 &&(playerAnswerLetter == answer[0]&& playerAnswerLetter == answer[1] && playerAnswerLetter == answer[2]
                 && playerAnswerLetter == answer[3] && playerAnswerLetter == answer[4] && playerAnswerLetter == answer[5])) {

                    System.out.println(" Yay, you won." + "The word was " + Arrays.toString( answer ));
                }


            }
        }
    }
}
