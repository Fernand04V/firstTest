//represents a single game


import java.io.FileNotFoundException;

public class WordleGame {
  //attributes
  /* allGuesses represents the wordle game */
  private WordleLetter[][] allGuesses = new WordleLetter[6][5];
  private int guesses;
  private String answer;
  


  /*------TODO - implement according to spec ------*/
  //constructor 
  //sets the answer technically
  public void puzzleNumber(int n){
    this.answer = WordBank.getAnswerForPuzzleNumber(n);
  }

  //gets the answer
  public String getAnswer(){
    return this.answer;
  }

  public void assingColor(WordleLetter letter, int indexLetter){
    for(int i = 0; i < this.answer.length() ; i++){
      if(letter.getLetter() == (this.answer.charAt(i)) && indexLetter == i){
        //if the letter in the guess is in the same position and is the same as the answer, the color will be set to green
        letter.setColor("green");
      }
      else if (letter.getLetter() == (this.answer.charAt(i))){
        //if the letter atleast exists in the answer, the color will be assined yellow
        letter.setColor("yellow");
      }
      else{
        //if none of the above conditions meet, then the color will be set to red
        letter.setColor("red");
      }
    }
  }

  //method
  public void guessWord(String userWord){
    //something needs to check if the userWord is valid(check instructions) and the color of the char is gonna be determined here
    //the color changes may not be saving

    WordleLetter l1 = new WordleLetter(userWord.charAt(0)); //setting the letter for the answer plumb
    assingColor(l1, 0);

    WordleLetter l2 = new WordleLetter(userWord.charAt(1)); //setting the letter for the answer plumb
    assingColor(l2, 1);

    WordleLetter l3 = new WordleLetter(userWord.charAt(2)); //setting the letter for the answer plumb
    assingColor(l3, 2);

    WordleLetter l4 = new WordleLetter(userWord.charAt(3)); //setting the letter for the answer plumb
    assingColor(l4, 3);

    WordleLetter l5 = new WordleLetter(userWord.charAt(4)); //setting the letter for the answer plumb
    assingColor(l5, 4); 

    this.allGuesses[this.guesses][0] = l1;
    this.allGuesses[this.guesses][1] = l2;
    this.allGuesses[this.guesses][2] = l3;
    this.allGuesses[this.guesses][3] = l4;
    this.allGuesses[this.guesses][4] = l5;

  }
  
  //method
  public int getNumberGuessesSoFar(){
    //this returns how many guesses are so far
    return this.guesses;
  }

  public void setNumberGuessesSoFar(int guessesIn){
    //this returns how many guesses are so far
    this.guesses = guessesIn;
  }

  //method
  public WordleLetter[] getGuess(int guessNumberRow){
    //this return the word guesses at the position of the input parameter
    return this.allGuesses[guessNumberRow];
  }
  

  //method
  public boolean isGameOver(){
    if (getAnswer() == "user's guess" || this.guesses > 5 && getAnswer() != "user's guess" ){
      return true;
    }
    return false;
  }


    //not done
  public boolean isGameWin(){
    return true;
  }
  



  /*------- TODO - include the remainder of the below code back in once rest of class is implemented.
            Do not modify this method implementation ------*/
  public String toString() {
    /* result will be used to build the full answer String */ 
    String result = ""; 
       /* for each word guessed so far */ 
     for (int i = 0; i < getNumberGuessesSoFar(); i++) {
         /* get each letter of each word */
       for (int j = 0; j < 5; j++) {
           /* concatenate it to the result */ 
           /* WordleLetter's toString() is automatically invoked here. */
         result += getGuess(i)[j];
       }
         /* new line separator between each word */ 
       result += "\n";
      }
    return result;
  }

}
