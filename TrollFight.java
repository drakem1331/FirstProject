package pokemon;

public class TrollFight {
	
	int damage;
	int maxHealth;
	int health;
	
	TrollFight(int DMG, int maxHP, int HP){
		maxHealth = maxHP;
		health = HP;
		damage = DMG;
	}
	
	public int pokemonFight() {
		System.out.println("The monster is a troll");
		Player player = new Player(damage, maxHealth, health);
		Troll enemy = new Troll();
			for(int i=0; i<1000;) {
				if(enemy.getHealth()>0) {
				if(player.getHealth()>0) {
				if(i%2==0) {
					int y = player.command();				
					if(y>=0) {i++;
						if(y>0) {
					enemy.takeDamage(y);
					System.out.println("The troll took "+y+" damage and has " + enemy.getHealth()+"HP left");
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
}}
