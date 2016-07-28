package oreshek.guessarino2;

public class AffectedSpellDmgHint extends Hint {

	public AffectedSpellDmgHint(Card card) {
		price = 1;
		text = getAffectedSpellDmg(card);
	}

	private String getAffectedSpellDmg(Card card) {
		String result =""; 
		if(card.text.contains("$")){
			result = "This card is affected by Spell Damage";
		}
		else
			result = "This card is not affected by Spell Damage";
		return result;
	}

}
