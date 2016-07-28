package oreshek.guessarino2;

public class HealthHint extends Hint {

	public HealthHint(Card card) {
		price =1;
		text = "This minion has "+card.health+ " health";
	}

}
