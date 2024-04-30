//another module
//This class creates instances of each character or letter in the guessed word. Here the color and the letter is described
//the methods allow to check if a letter has a color, set a color (being green, red, or yellor), and check if the color of a letter is green.
//no idea what toString does



public class WordleLetter{
	//atributes for the letter in the string
	private char letter;
	private String color;

	//constructor
	public WordleLetter(char letterIn){
		this.letter = letterIn;
	}

	public void setColor(String inputColor){
		//prob have a lock where it does not take any other color outside of the main 3
		this.color = inputColor;
	}

	//checks if the attribute of the letter has a color
	public boolean isColorSet(){
		if (color.equals(null)){
			return false;
		}
		return true;
	}

	//checks if the attribute color of the letter is green
	public boolean isGreen(){
		if (color.equals("green")){
			return true;
		}
		return false;
	}

	public char getLetter(){
		return this.letter;
	}

	/*  -----------------------------------------------------------------------
		TODO - include the below code back
		in once rest of class is implemented. 
		Do not modify this method implementation. 
		-----------------------------------------------------------------------*/ 
	public String toString() {
		//just for display purposes, it assings the color code for each char.
		/*	Determine the special characters to add at the beginning of the String
			to change the text color to the right color. */
		String colorCode;
		if(color.equals("green")) {
			colorCode = "\u001B[32m";
		} else if(color.equals("yellow")) {
			colorCode = "\u001B[33m";
		} else {
			colorCode = "\u001B[31m";
		}
	
		/*	These are the special character to add 
			to the end of the String 
			to signify the end of the color change. */
		String resetCode = "\u001B[0m";

		/*  Surround the letter with space characters and with 
			the above color changing special characters. */ 
		return String.format(
			"%s %s %s",
			colorCode, letter, resetCode);
	}
}
