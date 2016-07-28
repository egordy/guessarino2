package oreshek.guessarino2;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import com.github.kevinsawicki.http.HttpRequest;

public class GuessarinoGame {
	
	public static void main(String[] args) {
		/*String response = HttpRequest.get("https://api.hearthstonejson.com/10357/enUS/cards.collectible.json", true)
		        .accept("application/json")
		        .body();
		System.out.println("Response was: " + response);*/
		//final String PATH = "C:\\cards_collectible_json.json";
		
		/*CardCollection cardCollection = new CardCollection(PATH);
		Card card = cardCollection.getRandomCard();
		System.out.println(card.cost);
		System.out.println(card.playerClass);
		System.out.println(card.type);
		System.out.println(card.attack);
		System.out.println(card.set);
		System.out.println(card.health);
		System.out.println(card.flavor);
		System.out.println(card.name);*/
		
		GameEngine gameEngine = new GameEngine();
		gameEngine.letTheGamesBegin();

	}

}


