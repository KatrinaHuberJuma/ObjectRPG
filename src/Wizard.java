
public class Wizard extends Human {

	public Wizard(String name) {
		super(name);
		this.health = 50;
		this.intelligence = 8;// TODO Auto-generated constructor stub
	}
	public String displayStats() {
		return "Wizard " + super.displayStats();
	}
	public Wizard heal(Human friend) {
		System.out.println(this.name + " is healing " + friend.name);
		friend.health += this.intelligence;
		System.out.println(friend.name + " has health of " + friend.health);
		return this;
	}
	public Wizard fireball(Human foe) {
		System.out.println(this.name + " is burning " + foe.name);
		foe.health -= this.intelligence *3;
		System.out.println(foe.name + " has health of " + foe.health);
		return this;
	}
	

}
