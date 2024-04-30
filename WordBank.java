//what this code does is that it pulls a word from the "answers.txt" file which will be used as the answer
//the int parameter in the getAnswerForPuzzleNumber allows for the user to "chosse" his answer to guess
//the checkInDict method checks if the propposed word valid. Essentially, only allows guesses to be real words and not just random strings like "asdfg"

//this is at the start of each game

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordBank {

  /*  This first method implementation is completed for you already. 
      Do not modify the method signature 
   */
  public static String getAnswerForPuzzleNumber(int puzzleNumber) {
    try {
      /* Create a file scanner to read answers.txt */
      Scanner scanner = new Scanner(new File("answers.txt"));

      /* Skip the first puzzleNumber number of words in the file */
      for (int i = 0; i < puzzleNumber; i++) {
        scanner.next();
      }

      /* Return the very next word */
      return scanner.next();

    } catch (Exception e) {
      /* Handle exception */
      System.out.println("Input/File not found!");
    }
    return null;
  }

  /* Do not modify the method signature. */
  public static boolean checkInDictionary(String proposed) {
    try{
      Scanner scanner = new Scanner(new File("dictionary.txt"));
      while(scanner.hasNextLine()){
        String comp = scanner.nextLine();
        if (comp.equals(proposed)){
          return true;
        }
      }
    } catch (Exception e){
      /* Handle exception */
      System.out.println("Input/File not found!");
    }
    return false;  /*----TODO - implement and replace me ----*/
  }
}
