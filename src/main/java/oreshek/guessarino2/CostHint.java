package oreshek.guessarino2;

public class CostHint extends Hint {

	public CostHint(Card card) {
		price =1;
		text = "This card costs "+card.cost + " mana";
	}

}
