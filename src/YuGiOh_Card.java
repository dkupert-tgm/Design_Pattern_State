
public class YuGiOh_Card {

	//Der aktulle Zustand der Karte
	private YuGiOh_Card_State state;
	
	private Player cardOwner;
	private int atkValue;
	private int defValue;
	private Effect effect;
	private String cardDescription;
	
	public YuGiOh_Card(int atkVal, int defVal, Effect eff, String des, Player own) {
		this.state = null;
		this.atkValue = atkVal;
		this.defValue = defVal;
		this.effect = eff;
		this.cardDescription = des;
		this.cardOwner = own;
	}
	
	

	public void changeState(YuGiOh_Card_State newState) {
		//Diese Methode ändert den aktuellen Zustand des Objektes
		this.state = newState;
	}
	
	public void dmgCalculation(int takenDMG) {
		//Führt die Methode des jeweiligen Zustandes aus
		this.state.dmgCalculation(takenDMG);
	}
	
	public void switchMode() {
		//Führt die Methode des jeweiligen Zustandes aus
		this.state.switchMode();
	}
	
	public void useEffect() {
		this.state.useEffect();
	}
	
	public void attack(YuGiOh_Card enemy) {
		this.state.attack(enemy);
	}
	
	//Getter / Setter
	public YuGiOh_Card_State getState() {
		return state;
	}

	public void setState(YuGiOh_Card_State state) {
		this.state = state;
	}

	public Player getCardOwner() {
		return cardOwner;
	}

	public void setCardOwner(Player cardOwner) {
		this.cardOwner = cardOwner;
	}

	public int getAtkValue() {
		return atkValue;
	}

	public void setAtkValue(int atkValue) {
		this.atkValue = atkValue;
	}

	public int getDefValue() {
		return defValue;
	}

	public void setDefValue(int defValue) {
		this.defValue = defValue;
	}

	public Effect getEffect() {
		return effect;
	}

	public void setEffect(Effect effect) {
		this.effect = effect;
	}

	public String getCardDescription() {
		return cardDescription;
	}

	public void setCardDescription(String cardDescription) {
		this.cardDescription = cardDescription;
	}
}
