
public abstract class YuGiOh_Card_State {

	private YuGiOh_Card context;
	
	public YuGiOh_Card_State(YuGiOh_Card con) {
		this.context = con;
	}
	
	public abstract void dmgCalculation(int takenDMG);

	public abstract void switchMode();

	public abstract void useEffect();

	public abstract void attack(YuGiOh_Card enemy);

	public YuGiOh_Card getContext() {
		return context;
	}

	public void setContext(YuGiOh_Card context) {
		this.context = context;
	}
	
	
}
