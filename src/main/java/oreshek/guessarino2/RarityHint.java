package oreshek.guessarino2;

public class RarityHint extends Hint {

	public RarityHint(Card card) {
		price =1;
		text = " This card is "+card.rarity;
	}

}
