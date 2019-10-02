
public class Ninja extends Human {
	public Ninja(String name) {
		super(name);
		this.stealth = 10;
	}
	public String displayStats() {
		return "Ninja " + super.displayStats();
	}
	public Ninja steal(Human enemy) {
		System.out.println("ninja " + this.name + " has stolen health from " + enemy.name);
		enemy.health -= this.stealth;
		this.stealth *= 2;
		System.out.println(enemy.displayStats());
		System.out.println(this.displayStats());
		return this;
	}
	public Ninja runAway() {
		this.health -= 10;
		System.out.println("Run away!");
		return this;
	}
	
}
