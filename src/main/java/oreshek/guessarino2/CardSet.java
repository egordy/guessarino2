package oreshek.guessarino2;

import com.google.gson.annotations.SerializedName;


/*
 TGT
CORE
PROMO
HERO_SKINS
EXPERT1
NAXX
GVG
BRM
REWARD
 */
public enum CardSet {
	@SerializedName("INVALID")
	INVALID,

	@SerializedName("TEST_TEMPORARY")
	TEST_TEMPORARY, 

	@SerializedName("CORE")
	CORE,

	@SerializedName("EXPERT1")
	EXPERT1,

	@SerializedName("REWARD")
	REWARD,

	@SerializedName("MISSIONS")
	MISSIONS,

	@SerializedName("DEMO")
	DEMO,

	@SerializedName("NONE")
	NONE,

	@SerializedName("CHEAT")
	CHEAT,

	@SerializedName("BLANK")
	BLANK,

	@SerializedName("DEBUG_SP")
	DEBUG_SP,

	@SerializedName("PROMO")
	PROMO,

	@SerializedName("NAXX")
	NAXX,

	@SerializedName("GVG")
	GVG,

	@SerializedName("BRM")
	BRM,

	@SerializedName("TGT")
	TGT,

	@SerializedName("CREDITS")
	CREDITS,

	@SerializedName("HERO_SKINS")
	HERO_SKINS,

	@SerializedName("TB")
	TB,

	@SerializedName("SLUSH")
	SLUSH,

	@SerializedName("LOE")
	LOE;

	@Override
	public String toString() {
		switch(this) {
		case BRM:
			return "Blackrock Mountain";
		case CORE:
			return "Basic";
		case EXPERT1:
			return "Classic";
		case GVG:
			return "Goblins vs. Gnomes";
		case LOE:
			return "League of Explorers";
		case NAXX:
			return "Naxxramas";
		case PROMO:
			return "Promo";
		case REWARD:
			return "Reward";
		case TGT:
			return "The Grand Tournament";
		default:
			return this.name();
		}
	}
}
