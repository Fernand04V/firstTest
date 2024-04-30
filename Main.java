//where the magic happens, all of the classes will be used here as objects
//the scanners in the parameters of the methods are just there so you dont have to re-implement them again for each method

//from yesterday: Mostly everything should be rightly implemented, at the moment, the tostring works but the cases are printing out null.
//keep in mind that the 2d array is so that the letter can be stored for display purposes in one of the tostrings
//also the toString are just display the user's word of choice

import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;

public class Main {

    /* Do not modify the method signature. */ 
    public static WordleGame startGame(Scanner scanner)  {
        System.out.print("Chosse a number between 0 and 2315: ");
        int userWorldeOption = Integer.parseInt(scanner.nextLine());
        //System.out.println(WordBank.getAnswerForPuzzleNumber(userWorldeOption));
        WordleGame answer = new WordleGame();
        answer.puzzleNumber(userWorldeOption);
        return answer;  /*------ TODO - implement and replace me -------*/ 
    }

    /* Do not modify the method signature. */ 
    public static void playGame(Scanner scanner, WordleGame game)  {
        /*------ TODO - implement -------*/ 
        int i = 1;
        game.setNumberGuessesSoFar(i);
        while(true){
            System.out.print("Enter a 5 letter word guess: ");
            String userWordGuess = scanner.nextLine();
            if (WordBank.checkInDictionary(userWordGuess)){
                game.guessWord(userWordGuess);
                System.out.println(game.toString());


                game.setNumberGuessesSoFar(i++);
            }
            else{
                System.out.println("Please enter a valid guess");
            }
        }
        
    }

    /* Do not modify the method signature. */ 
    public static void reportGameOutcome(WordleGame game) {
        /*------ TODO - implement -------*/ 
    }

    /* This main method body should not be modified. */ 
    public static void main(String[] args) {
        //apperantly each letter is stored in an array;
        /* Only use this Scanner for user input, do not create new ones via new Scanner(System.in).*/ 
        Scanner scanner = new Scanner(System.in);
        WordleGame game = startGame(scanner);
        playGame(scanner, game);
        reportGameOutcome(game);
        



        


        //initialiate a new wordle game
        //return newly created wordle game instance

        
    }
}
