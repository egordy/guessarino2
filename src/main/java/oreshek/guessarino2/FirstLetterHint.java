package oreshek.guessarino2;

public class FirstLetterHint extends Hint {

	public FirstLetterHint(Card card) {
		text = "First Letter: "+ getFirstLetter(card.name);
		price = 1;
	}

	private String getFirstLetter(String cardName) {
		String firstLetter = cardName.substring(0, 1);	
		return firstLetter;
	}
}

