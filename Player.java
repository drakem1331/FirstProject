package pokemon;
import java.util.Scanner;

public class Player {
	int damage;
	int maxHealth;
	int health;
	int weaponDamage;
	
	Player(int DMG, int maxHP, int HP){
		maxHealth = maxHP;
		health = HP;
		damage = DMG;
	}
	
	//Getters
	public int getMaxHP() {
		return maxHealth;
	}
	public int getHealth() {
		return health;
	}
	public int getDamage() {
		return damage;
	}
	
	//Setters
	public void setStats(int DMG, int maxHP, int HP) {
		maxHealth = maxHP;
		health = HP;
		damage = DMG;
	}
	public String setName() {
		var scanner = new Scanner(System.in);
		String name = scanner.next();
		return name;
	}
	
	//Interface controls
	public void armourSwap(int a) {
		maxHealth=300+a;
	}
	public void weaponSwap(int a) {
		weaponDamage=a;
		damage=15+a;
	}

	//Player interface
	public void showStats() {
		System.out.println("Max hp: "+maxHealth);
		System.out.println("Current hp: "+health);
		System.out.println("Attack Damage: "+ damage);
		
	}
	
	
	//Combat commands
	public void resetStats() {
		damage=15+weaponDamage;
		health = maxHealth;
	}
	public void increaseAttackValue() {
		System.out.println("You meditate to increase your potential");
		damage=damage+10;
	}
	
	public void takeDamage(int damage) {
		health = health - damage;
	}
	
	public int attack() {
		System.out.println("You have successfully attacked for "+ (damage));
		return (damage);
		}
	
	public int command() {
		System.out.println("You notice a chance to attack! What do you do?");
		var scanner = new Scanner(System.in);
		Boolean i = false;
		do{
		String command = scanner.next();
		String option = command.toUpperCase();
		switch(option) {
		case "ATTACK":
		attack();
		i = true;
		return damage;
		case "MEDITATE":
		increaseAttackValue();
		i = true;
		return 0;
		default:
		System.out.println("Please enter a valid command such as attack");
		System.out.println();
		return -5;
			}}while(i!=true);
	}}
	

