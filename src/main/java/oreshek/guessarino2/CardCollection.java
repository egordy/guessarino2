package oreshek.guessarino2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class CardCollection {
	private ArrayList<Card> cards;

	public CardCollection(String path) {
		cards = new ArrayList<Card>();
		//readFromCsv(path);
		readFromJson(path);
	}

	private void readFromJson(String path) {
		Gson gson = new Gson();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(path));
			cards = gson.fromJson(br, new TypeToken<ArrayList<Card>>(){}.getType());
		} catch (FileNotFoundException e) {
			System.out.print("I/O error! Cannot access: " + path);
			e.printStackTrace();
		}
		
		/*HashSet sets = new HashSet<String>();
		for(Card card : cards)
		{
			if (card.mechanics!=null)
			sets.addAll(Arrays.asList(card.mechanics));
		}
		for(Object set : sets)
		{
			System.out.println(set.toString());
		}*/
		
	}

	private void readFromCsv(String path) {
		try {
			for(String line : Files.readAllLines(Paths.get(path))) {
				for (int i=0; i<line.length(); i++){
					if (line.charAt(i) == ',') {
						Card card = new Card();
						card.name = line.substring(0,i);
						card.flavor = line.substring(i+1);
						cards.add(card);
						break;
					}
				}		
			}

		} catch (IOException e) {
			System.out.print("I/O error! Cannot access: " + path);
			e.printStackTrace();
		}
	}

	public Card getRandomCard() {
		int randomCardIndex = (int) (Math.random()*cards.size());
		return cards.get(randomCardIndex);
	}

	public ArrayList<Card> getRandomCards(int cardCount) {
		ArrayList<Card> shuffledCards = new ArrayList<Card>(cards);
		Collections.shuffle(shuffledCards);
		shuffledCards.subList(cardCount, shuffledCards.size()).clear();
		return shuffledCards;
	}
}
