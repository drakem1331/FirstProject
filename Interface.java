package pokemon;
import java.util.Scanner;
import java.util.Random;

public class Interface {
	Shop shop = new Shop();
	Player player = new Player(15, 300, 300);
	Inventory inventoryTester = new Inventory();
	Random rng = new Random();
	int loc7fight=0;
	Location openWorld = new Location(1,1);
	Boolean noWander = false;
	
	public void earnGold(int gold) {
		shop.earnGold(gold);
	}
	
	public void playerInterface () {
		Boolean next = false;
		Scanner scanner = new Scanner(System.in);
		do {
			String c = scanner.next();
			String a = c.toUpperCase();
			switch(a) {
				case "C":
				player.showStats();
				break;
				case "SHOP":
				if(openWorld.checkLocation()==6) {
				int y = shop.openShop();
				if(y==1) {
				inventoryTester.setBoDInventory();
				}
				if(y==2){
				inventoryTester.setHWInventory();
				}
				if(y==3){
				inventoryTester.setAoNInventory();
				}}else {
					System.out.println("You are not near a Shop");
				}
				break;
				case "EQUIP":
					System.out.println("What item do you want to equip? Type the name of the item with no spaces");
					c = scanner.next();
					a = c.toUpperCase();
					switch(a){
					case "BLADEOFDESTINY":
					int x = inventoryTester.equipWeapon("BLADEOFDESTINY");
					player.weaponSwap(x);
					break;
					case "ARMOROFNOOB":
					x = inventoryTester.equipItem("ARMOROFNOOB");
					player.armorSwap(x);
					break;
					case "HOMEWRECKER":
					x = inventoryTester.equipWeapon("HOMEWRECKER");
					player.weaponSwap(x);
					break;
					default:
					inventoryTester.equipWeapon("x");
					break;
					}
				break;
				case "TRAIN":
				PokemonBattleThomas thomas = new PokemonBattleThomas(getDamage(), getMaxHP(), getHealth());
				int currentHP=thomas.pokemonFight();
				setStats(getDamage(), getMaxHP(), currentHP);
				earnGold(5);
				break;
				case "HEAL":
				if(openWorld.checkLocation()==6) {
				setStats(getDamage(), getMaxHP(), getMaxHP());
				}else {
					System.out.println("You cannot rest here");
				}
				break;
				case "INVENTORY":
				inventoryTester.displayInventory();
				break;
				case "MOVE":
					System.out.println("Where do you want to go?");
					openWorld.move();
					int loc = openWorld.checkLocation();
					System.out.println(loc);
					int random = rng.nextInt();
					if(loc==7){
						System.out.println("You see a dusty, empty house boarded up");
						if(loc7fight<=1) {
							noWander = true;
							System.out.println("Another Wild Charizard Attacks!");
							PokemonBattleCharizard charizard = new PokemonBattleCharizard(getDamage(),getMaxHP(),getHealth());
							Boolean survived = charizard.pokemonFight();
							if(survived == false) {
								openWorld.setLocation(1, 1);
								earnGold(-100);
							}else{
							earnGold(300);
							loc7fight++;
							}
						}
					}
					else if(loc==8) {
							System.out.println("A dusty road crosses to the from West to East, to the North you see rocky hills, and to the South a nasty mire.");
						}
					if(loc!=6) {
						if(noWander==false) {
							if(random%3==0) {
								System.out.println("A wandering monster has found you!");
								int r = rng.nextInt();
								if(r%3==0) {
								TrollFight troll = new TrollFight(getDamage(),getMaxHP(),getHealth());
								int survived = troll.pokemonFight();
								if(survived == 0) {
									openWorld.setLocation(1, 1);
									earnGold(-100);
									player.setStats(15, 300, 300);
								}else{
									earnGold(50);
									player.setStats(getDamage(),getMaxHP(),survived);
								}
								}
						else{
							HobgoblinFight hobgoblin = new HobgoblinFight(getDamage(),getMaxHP(),getHealth());
							int survived = hobgoblin.pokemonFight();
									if(survived == 0) {
										openWorld.setLocation(1, 1);
										earnGold(-50);
										player.setStats(15, 300, 300);
									}else{
										earnGold(10);
										player.setStats(getDamage(),getMaxHP(),survived);
									}
						}}}}
					noWander = false;
					break;
				case "EXITGAME":
				next = true;
				break;
				default:
				System.out.println("Please type 'move' to continue the story");
				break;}
		}while(next==false); 
	}
	
	//Getters
	public int getMaxHP() {
		return player.getMaxHP();
	}
	public int getHealth() {
		return player.getHealth();
	}
	public int getDamage() {
		return player.getDamage();
	}
	//Setters
	public void setStats(int DMG, int maxHP, int HP) {
		player.setStats(DMG, maxHP, HP);
	}
}
