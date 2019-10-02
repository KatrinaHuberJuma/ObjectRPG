
public class Human {
	public String name;
	public int stealth;
	public int intelligence;
	public int strength;
	public int health;
	
	public Human(String name) {
		this.intelligence = 3;
		this.stealth = 3;
		this.strength = 3; 
		this.health = 100;
		this.name = name;
		System.out.println("Human object made");
		System.out.println(this.displayStats());
	}
	public String displayStats() {
		return this.name +" strength: "+ this.strength +" intelligence "+ this.intelligence +" health "+ this.health;
	}
	
	public void attack(Human enemy) {
		System.out.println(enemy.displayStats());
		System.out.println(this.name + " attacked "+ enemy.name + "!!!");
		enemy.health -= this.strength;
		System.out.println(this.displayStats());
		System.out.println(enemy.displayStats());
	}
	

}
