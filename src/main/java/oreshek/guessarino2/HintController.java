package oreshek.guessarino2;

import java.util.ArrayList;
import java.util.Collections;

public class HintController {
	private ArrayList<Hint> hints = new ArrayList<Hint>();
	private int hintIndex = 0;

	public HintController(Card card) {
		hints.add(new ClassHint(card));
		hints.add (new RarityHint(card));
		hints.add(new CostHint(card));
		hints.add(new SetHint(card));
		hints.add(new MechanicsHint(card));
		Collections.shuffle(hints);
		hints.add(new TypeHint(card));
		if(card.type.equalsIgnoreCase("minion")){
			hints.add(new AttackHint(card));
			hints.add(new HealthHint(card));
			if(card.race!=null && !card.race.trim().isEmpty()) {
				hints.add(new RaceHint(card));
			}	
		}
		else {
			hints.add(new AffectedSpellDmgHint(card));
		}
		hints.add (new MaskerHint(card));
		hints.add(new FirstLetterHint(card));
		
		hints.add(new FlavorHint(card));
		hints.add(new TextHint(card));
		
	}

	public boolean areHintsLeft(){
		return hintIndex < hints.size(); 
	}

	public Hint getNextHint(){
		if(areHintsLeft()){
			Hint hint = hints.get(hintIndex);
			hintIndex++;
			return hint;
		}	
		return null; 
	}

}
