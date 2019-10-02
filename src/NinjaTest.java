
public class NinjaTest {
	public static void main(String[] args) {
		Ninja nelly = new Ninja("nelly");
		Ninja bee = new Ninja("bee");
		bee.steal(nelly).runAway();
	}
}
