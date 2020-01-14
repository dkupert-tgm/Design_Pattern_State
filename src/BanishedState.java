
public class BanishedState extends YuGiOh_Card_State {

	public BanishedState(YuGiOh_Card con) {
		super(con);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dmgCalculation(int takenDMG) {
		System.out.println("Du wurdest Verbannt");
	}

	@Override
	public void switchMode() {
		System.out.println("Du kannst den Modus nicht ändern,da du verbannt wurdest");
	}

	@Override
	public void useEffect() {
		// TODO Auto-generated method stub
		System.out.println("Du kannst keine Effekte wirken,da du verbannt wurdest");
	}

	@Override
	public void attack(YuGiOh_Card enemy) {
		// TODO Auto-generated method stub
		System.out.println("Du kannst nicht angreifen, da du verbannt wurdest");

	}

}
