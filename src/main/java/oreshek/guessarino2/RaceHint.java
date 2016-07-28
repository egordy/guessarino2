package oreshek.guessarino2;

public class RaceHint extends Hint {

	public RaceHint(Card card) {
		price =1;
		text = "This minion is from "+card.race+ " tribe";
	}

}
