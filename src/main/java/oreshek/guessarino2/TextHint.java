package oreshek.guessarino2;

public class TextHint extends Hint {
	public TextHint(Card card) {
		price = 1;
		if(card.text.trim().isEmpty()){
			text = "This Card has no text";
		}
		else {
			text = "Card Reads: "+ card.text.replaceAll( "\\<.*?>","").replaceAll("[\\$#]", "");
		}
	}

}
