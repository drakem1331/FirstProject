package pokemon;
import java.util.Scanner;

public class Interface {
	Shop shop = new Shop();
	Player player = new Player(15, 300, 300);
	Inventory inventoryTester = new Inventory();
	
	
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
				int y = shop.openShop();
				if(y==1) {
				inventoryTester.setBoDInventory();
				}
				if(y==2){
				inventoryTester.setHWInventory();
				}
				break;
				case "EQUIP":
					System.out.println("What weapon do you want to equip? Type the name of the weapon with no spaces");
					c = scanner.next();
					a = c.toUpperCase();
					switch(a){
					case "BLADEOFDESTINY":
					int x = inventoryTester.equipWeapon("BLADEOFDESTINY");
					player.weaponSwap(x);
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
				setStats(getDamage(), getMaxHP(), getMaxHP());
				break;
				case "INVENTORY":
				inventoryTester.displayInventory();
				break;
				case "NEXT":
				next = true;
				break;
				default:
				System.out.println("Please type 'next' to continue the story");
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
