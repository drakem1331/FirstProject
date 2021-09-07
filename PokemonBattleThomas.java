package pokemon;

public class PokemonBattleThomas {
	int damage;
	int maxHealth;
	int health;
	PokemonBattleThomas(int DMG, int maxHP, int HP){
		maxHealth = maxHP;
		health = HP;
		damage = DMG;
	}
	
	public int pokemonFight() {
		Player player = new Player(damage, maxHealth, health);
		ThomasTrainer enemy = new ThomasTrainer();
			for(int i=0; i<1000;) {
				if(enemy.getHealth()>0) {
				if(player.getHealth()>0) {
				if(i%2==0) {
					int y = player.command();				
					if(y>=0) {i++;
						if(y>0) {
					enemy.takeDamage(y);
					System.out.println("Thomas took "+y+" damage and has " + enemy.getHealth()+"HP left");
					}}}else {
					i++;
					int x = enemy.act();
					player.takeDamage(x);
						if(x!=0) {
						System.out.println("You took "+x+" damage and have " + player.getHealth()+"HP left");
				}else {System.out.println("Thomas healed himself for 25 damage and has " + enemy.getHealth()+"HP left");
				}}}else {
			player.resetStats();
			enemy.easyStats();
			System.out.println("You lost! Try again");
		}

		
		}else{
			System.out.println("You won!");
			break;
}}
			return player.getHealth();
}}
