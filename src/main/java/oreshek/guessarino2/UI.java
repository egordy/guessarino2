package oreshek.guessarino2;

public class UI {
	public static void printWelcome(int coins, int cardsToGuess) {
		System.out.println("Hello! In this game you need to guess 3 cards using as less hints and attempts as possible."
				+ "\nYou have "+coins+" coins to spend and "+ cardsToGuess +" cards to guess. "
				+ "\nEach attempt costs 1 coin. "
				+ "\nEach hint costs 1 coin. "
				+ "\nGood Luck!");
}
	public static void printInstructions() {
		System.out.println("Type a Card Name or 'hint' to play. Type 'exit' to quit.");
	}
	
	public static void printResult(int coins, int cardsGuessed) {
	System.out.println("Your result is "+ coins +" coins left and " + cardsGuessed +" cards guessed correctly.");
	}
	
	public static void printHint(String hintText) {
		System.out.println("Hint: "+hintText);
	}
	
	public static void testPrintGeneratedCards(String card1, String card2, String card3){
		System.out.println(card1+", "+card2+", "+card3);
	}
	
	public static void printNoHintsLeft(){
		System.out.println("Sorry, no hints left! Guess a Card by typing the Name");
	}
	
	public static void printCorrect(int coins, int correctGuesses) {
		System.out.println("Correct!");
		printResult(coins, correctGuesses);
	}
	
	public static void printWrong(int coins, int correctGuesses) {
		System.out.println("Wrong!");
		printResult(coins, correctGuesses);
	}
	
	public static void printOutOfCoins(){
		System.out.println("You are out of coins!");
	}
	
	public static void printEndTheGame(int coins, int correctGuesses) {
		System.out.print("Thank you for playing!");
		printResult(coins, correctGuesses);
		System.out.print("\nPress 'Enter' to exit.");
	}
}