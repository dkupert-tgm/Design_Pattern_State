
public class TestKlasse {
	public static void main(String[] args) {
		YuGiOh_Card exodia_die_verbotene = new YuGiOh_Card(10000, 10000, new Effect(), "Eine ur coole Karte", new Player());
		YuGiOh_Card trash_mob = new YuGiOh_Card(10, 10, new Effect(), "Eine echt langweilige Karte", new Player());
		
		exodia_die_verbotene.setState(new AttackState(exodia_die_verbotene));
		trash_mob.setState(new AttackState(trash_mob));
		exodia_die_verbotene.switchMode();
		exodia_die_verbotene.attack(trash_mob);
		
		trash_mob.dmgCalculation(1000);
		trash_mob.attack(exodia_die_verbotene);
		
	}	
}
