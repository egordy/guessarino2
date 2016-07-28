package oreshek.guessarino2;

public class ClassHint extends Hint {

	public ClassHint(Card card) {
		price = 1;
		text = getHero (card); 
	}
	public String getHero(Card card){
		if (card.playerClass!=null&&!card.playerClass.isEmpty()) {
			return "This card is for class " +card.playerClass;
		}
		else 
			return "This Card is Neutral";
	}

}
