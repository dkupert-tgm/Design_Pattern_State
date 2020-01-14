
public class DefenseState extends YuGiOh_Card_State {

	public DefenseState(YuGiOh_Card con) {
		super(con);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dmgCalculation(int takenDMG) {
		// Im Defensemodus wird die Def der Karte als Verteidigung benommen
		// Der Spieler nimmt keinen Schaden wenn die Karte zerstört wird
		if (this.getContext().getDefValue() <= takenDMG) {
			System.out.println("Deine Karte wurde zerstört");
			System.out.println("Du hast keinen Schaden genommen");
			// Hier wird der Zustand geändert
			this.getContext().changeState(new GraveyardState(this.getContext()));
		} else {

		}

	}

	@Override
	public void switchMode() {
		System.out.println("Wechsele Modus: Verteidigung --> Angrief");
		this.getContext().changeState(new AttackState(this.getContext()));

	}

	@Override
	public void useEffect() {
		// TODO Auto-generated method stub
		System.out.println("Wirke Effekt");
		this.getContext().getEffect().act();
	}

	@Override
	public void attack(YuGiOh_Card enemy) {
		// TODO Auto-generated method stub
		System.out.println("Du kannst nicht Angreifen, wenn du im Verteidigungsmodus bist");
	}

}
