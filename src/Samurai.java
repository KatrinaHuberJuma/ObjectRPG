
public class Samurai extends Human {
	private static int numInstances = 0;

	public Samurai(String name) {
		super(name);
		this.health = 200;
		numInstances ++;
	}
	public String displayStats() {
		return "Samurai " + super.displayStats();
	}
	public Samurai deathBlow(Human foe) {
		foe.health = 0;
		this.health /= 2;
		System.out.println(this.name + " health: " + this.health + ", " + foe.name + ": "+ foe.health + " health");
		return this;
	}
	public Samurai meditate() {
		this.displayStats();
		this.health += this.health/2;
		System.out.println("Samurai " + this.name + " has meditated up to " + this.health + " health");
		return this;
	}
	public static int howMany() {
		return numInstances;
	}

}
