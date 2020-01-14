
public class AttackState extends YuGiOh_Card_State{


	public AttackState(YuGiOh_Card con) {
		super(con);
	}

	@Override
	public void dmgCalculation(int takenDMG) {
		//Im Attackmodus wird die Atk der Karte als Verteidigung benommen
		//Der Spieler nimmt aber Schaden wenn die Karte zerstört wird
		if(this.getContext().getAtkValue() <= takenDMG) {
			System.out.println("Deine Karte wurde zerstört");
			this.getContext().getCardOwner().takeDMG(takenDMG-this.getContext().getAtkValue());
			System.out.println("Du hast: "+(takenDMG-this.getContext().getAtkValue())+ " pkt. Schaden genommen!");
			//Hier wird der Zustand geändert
			this.getContext().changeState(new GraveyardState(this.getContext()));
		}else {
			
		}
		
	}

	@Override
	public void switchMode() {
		System.out.println("Wechsele Modus: Angrief --> Verteidigung");
		this.getContext().changeState(new DefenseState(this.getContext()));
	}

	@Override
	public void useEffect() {
		System.out.println("Wirke Effekt");
		this.getContext().getEffect().act();
		
	}

	@Override
	public void attack(YuGiOh_Card enemy) {
		System.out.println("Greife eine Karte an");
		enemy.dmgCalculation(this.getContext().getAtkValue());
	}

}
