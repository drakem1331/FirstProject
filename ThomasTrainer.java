package pokemon;

import java.util.Random;

public class ThomasTrainer {
	int damage=8;
	int health = 800;
	Random rng = new Random();
	
	public void easyStats() {
		damage=7;
		health=400;
	}
	public void heal() {
		health=health+25;
	}
	public int attack() {
		System.out.println("Thomas attacks for "+damage);
		return damage;
	}
	public void takeDamage(int damage) {
		health = health - damage;
	}
	public int getHealth() {
		return health;
	}
	public int act() {
		int number = rng.nextInt();
		if(number%2==0) {
			System.out.println();
			attack();
			return damage;
		}else{
			System.out.println();
			heal();
			return 0;
		}
		
	}
}
