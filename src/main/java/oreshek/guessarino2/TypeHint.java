package oreshek.guessarino2;

public class TypeHint extends Hint {

	public TypeHint(Card card) {
		price = 1;
		text = "This Card is of type "+card.type;
	}

}
