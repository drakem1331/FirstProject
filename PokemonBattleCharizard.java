package pokemon;

public class PokemonBattleCharizard {
	int damage;
	int maxHealth;
	int health;
	
	PokemonBattleCharizard(int DMG, int maxHP, int HP){
		maxHealth = maxHP;
		health = HP;
		damage = DMG;
	}
	
	public void pokemonFight() {
	Player player = new Player(damage, maxHealth, health);
	Charizard enemy = new Charizard();
		for(int i=0; i<1000;) {
			if(enemy.getHealth()>0) {
			if(player.getHealth()>0) {
			if(i%2==0) {
				int y = player.command();				
				if(y>=0) {i++;
					if(y>0) {
				enemy.takeDamage(y);
				System.out.println("Charizard took "+y+" damage and has " + enemy.getHealth()+"HP left");
				}}}else {
				i++;
				int x = enemy.act();
				player.takeDamage(x);
				if(x!=0) {
					System.out.println("You took "+x+" damage and have " + player.getHealth()+"HP left");
				}
			}
		}else {player.resetStats();
		enemy.easyStats();
		System.out.println("You lost! Try again");
	}

	
	}else{
		System.out.println("You won!");break;

}}
}}
