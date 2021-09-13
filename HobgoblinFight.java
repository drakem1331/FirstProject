package pokemon;

public class HobgoblinFight {
	
	int damage;
	int maxHealth;
	int health;
	
	HobgoblinFight(int DMG, int maxHP, int HP){
		maxHealth = maxHP;
		health = HP;
		damage = DMG;
	}
	
	public int moriaFight() {
		System.out.println("The monster is a hobgoblin");
		Player player = new Player(damage, maxHealth, health);
		Hobgoblin enemy = new Hobgoblin();
			for(int i=0; i<1000;) {
				if(enemy.getHealth()>0) {
				if(player.getHealth()>0) {
				if(i%2==0) {
					int y = player.command();				
					if(y>=0) {i++;
						if(y>0) {
					enemy.takeDamage(y);
					System.out.println("The hobgoblin took "+y+" damage and has " + enemy.getHealth()+"HP left");
					}}}else {
					i++;
					int x = enemy.act();
					player.takeDamage(x);
					if(x!=0) {
						System.out.println("You took "+x+" damage and have " + player.getHealth()+"HP left");
					}
				}
			}else{
			System.out.println("You lost! Better luck next time... you wake up in the town");
			return 0;
		}
		}else{
			System.out.println("You won!");
			break;
	}}return player.getHealth();
}
}
