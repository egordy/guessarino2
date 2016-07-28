package oreshek.guessarino2;

public class SetHint extends Hint {

	public SetHint(Card card) {
		price=1;
		text="This Card is from set "+card.set.toString();
	}

}
