
public class HumanTest {
	public static void main(String[] args) {
//		Human bob = new Human("Bob");
//		Human lisa = new Human("Lisa");
//		lisa.attack(bob);
		Ninja nelly = new Ninja("nelly");
		Ninja bee = new Ninja("bee");
		bee.steal(nelly).runAway();
		Wizard hermione = new Wizard("Hermione");
		hermione.heal(bee).fireball(nelly);
		Samurai sam = new Samurai("sam");
		sam.deathBlow(nelly).meditate();
		Samurai betty = new Samurai("betty");
		betty.meditate();
		System.out.println(Samurai.howMany() + " samurai exist");
	}
}
