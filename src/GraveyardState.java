
public class GraveyardState extends YuGiOh_Card_State {

	public GraveyardState(YuGiOh_Card con) {
		super(con);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dmgCalculation(int takenDMG) {
		System.out.println("Du bist bereits am Friedhof");

	}

	@Override
	public void switchMode() {
		System.out.println("Du kannst den Modus nicht ändern, da du am Friedhof bist");

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
		System.out.println("Du kannst nicht angreifen, da du am Friedhof bist");

	}

}
