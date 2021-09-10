package pokemon;

public class Troll {
	int damage = 150;
	int health = 300;
	
	public int attack() {
		System.out.println("The troll attacks for "+damage);
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
