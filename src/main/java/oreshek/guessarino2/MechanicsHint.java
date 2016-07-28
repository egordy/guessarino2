package oreshek.guessarino2;

public class MechanicsHint extends Hint {

	public MechanicsHint(Card card) {
		price =1;
		text = getMechanics(card);
	}
	public String getMechanics(Card card) {
		String result ="";
		if(card.mechanics!=null){
			for (int i=0; i<card.mechanics.length; i++){
				result+=card.mechanics[i]+ " ";	
			}
		}
		return result.isEmpty() ? "This card has no mechanics": "This card has these mechanic(s): "+ result;
	}
}
