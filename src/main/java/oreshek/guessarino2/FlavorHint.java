package oreshek.guessarino2;

public class FlavorHint extends Hint {

	public FlavorHint(Card card) {
		text = "Flavor: "+ card.flavor;
		price = 1;
	}
}
