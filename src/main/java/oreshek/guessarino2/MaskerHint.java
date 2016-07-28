package oreshek.guessarino2;

public class MaskerHint extends Hint {

	public MaskerHint(Card card) {
		price = 1;
		text = getMask (card.name);
	}

	public String getMask(String cardName){
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<cardName.length(); i++) {
			if(cardName.charAt(i)!=' ') {
				sb.append('*');
			}
			else
				sb.append(cardName.charAt(i));
		}

		return sb.toString();
	}

}
