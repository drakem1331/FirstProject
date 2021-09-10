package pokemon;

public class Hobgoblin {
	int damage = 50;
	int health = 400;
	
	public int attack() {
		System.out.println("The hobgoblin attacks for "+damage);
		return damage;
	}
	public void takeDamage(int damage) {
		health = health - damage;
	}
	public int getHealth() {
		return health;
	}
	public int act() {
			System.out.println();
			attack();
			return damage;
		}
}
