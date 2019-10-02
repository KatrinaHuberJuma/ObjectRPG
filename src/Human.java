
public class Human {
	public String name;
	public int stealth;
	public int intelligence;
	public int strength;
	public int health;
	public void displayStats() {
		System.out.println(this.name +" strenth: "+ this.strength +" health "+ this.health);
	}
	public Human(String name) {
		this.intelligence = 3;
		this.stealth = 3;
		this.strength = 3; 
		this.health = 100;
		this.name = name;
		System.out.println("Human object made");
		this.displayStats();
	}
	
	public void attack(Human enemy) {
		enemy.displayStats();
		System.out.println(this.name + " attacked "+ enemy.name + "!!!");
		enemy.health -= this.strength;
		this.displayStats();
		enemy.displayStats();
	}
	

}
