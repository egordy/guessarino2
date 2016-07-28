package oreshek.guessarino2;

public class AttackHint extends Hint {

	public AttackHint(Card card) {
		price =1;
		text = "This minion has "+card.attack +" attack";
	}

}
