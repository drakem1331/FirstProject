package pokemon;
import java.util.Random;

public class Charizard {
	String color = "orange";
	String name = "Charizard";
	int damage=15;
	int health = 300;
	Random rng = new Random();
	
	public void easyStats() {
		damage=10;
		health=200;
	}
	public void increaseAttackValue() {
		System.out.println("Charizard increases his attack value");
		damage=damage+10;
	}
	public int attack() {
		System.out.println("Charizard attacks for "+damage);
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
			increaseAttackValue();
			return 0;
		}
		
	}
}
