package oreshek.guessarino2;

import java.io.IOException;
import java.util.Scanner;

public class GameEngine {
	private static final int INITIAL_COINS = 30;
	private static final int INITIAL_CARDS_TO_GUESS = 3;
	private static final String PATH = "C:\\cards_collectible_json.json";
	//private static final String PATH = "C:\\cards_damage.json";
	int coins = INITIAL_COINS;
	int cardsToGuess=  INITIAL_CARDS_TO_GUESS;
	Scanner scan= new Scanner(System.in);
	boolean shouldExit = false;

	public void letTheGamesBegin(){
		UI.printWelcome(INITIAL_COINS, INITIAL_CARDS_TO_GUESS);
		CardCollection cardCollection = new CardCollection(PATH);
		for(Card card: cardCollection.getRandomCards(INITIAL_CARDS_TO_GUESS)) {
			if(shouldExit) {
				break;
			}
			HintController hintController = new HintController(card);
			UI.printInstructions();
			UI.printHint(hintController.getNextHint().text);
			while(true) {
				
				if (coins>0) {
					String userInputfromKb= scan.nextLine();

					if(userInputfromKb.equalsIgnoreCase("exit")){
						shouldExit = true;
						break;
					}
					if (userInputfromKb.equalsIgnoreCase("hint")){
						if(hintController.areHintsLeft()){
							Hint hint = hintController.getNextHint();
							coins = coins- hint.price;
							UI.printHint(hint.text);
							continue;
						}
						else {
							UI.printNoHintsLeft();
							continue;
						}
					}
					if(userInputfromKb.equalsIgnoreCase(card.name))	{
						coins--;
						cardsToGuess--;
						UI.printCorrect(coins, INITIAL_CARDS_TO_GUESS-cardsToGuess);
						break;
					}
					else {
						coins--;
						UI.printWrong(coins,INITIAL_CARDS_TO_GUESS-cardsToGuess );
						continue;
					}
				}

				else {
					UI.printOutOfCoins();
					shouldExit = true;
					break;
				}
			}
		}
		UI.printEndTheGame(coins, INITIAL_CARDS_TO_GUESS-cardsToGuess);
		scan.nextLine();
		scan.close();
	}
}



