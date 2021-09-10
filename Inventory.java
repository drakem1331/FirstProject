package pokemon;

public class Inventory {
	Boolean BoDinventory = false;
	Boolean HWinventory = false;
	int weaponDamage = 0;
	int armorHP = 0;
	Boolean AoNinventory = false;
	
	public void setBoDInventory() {
			BoDinventory = true;
	}
	public void setHWInventory() {
			HWinventory = true;
	}
	public void setAoNInventory() {
			AoNinventory = true;
	}
	
	public void displayInventory() {
		System.out.println("Your inventory contains: ");
		if(BoDinventory==true) {
			System.out.println("Blade of Destiny");
		}
		if(HWinventory==true) {
			System.out.println("Homewrecker");
		}
		if (AoNinventory==true) {
			System.out.println("Armor of Noob");
		}
	}

	public int purchaseItem(char d, int gold) {
		if(d == 'a') {
		if(BoDinventory==false) {
			if(gold>=30) {
				BoDinventory = true;
				System.out.println("You have successfully purchased the Blade of Destiny");
				System.out.println("");
				return 1;
			}else{
				System.out.println("You cannot afford a Blade of Destiny");
				System.out.println("");
				return 0;
		}
		}else {
			System.out.println("You already own a Blade of Destiny");
			System.out.println("");
			return 0;
	}}else if(d == 'b') {
		if(HWinventory==false) {
			if(gold>=15){
				HWinventory = true;
				System.out.println("You have successfully purchased the Homewrecker");
				System.out.println("");
				return 2;
			}else{
				System.out.println("You cannot afford a Homewrecker");
				System.out.println("");
				return 0;
			}
		}else{
			System.out.println("You already own a Homewrecker");
			System.out.println("");
			return 0;}
		}
		if(d == 'c') {
		if(AoNinventory==false) {
			if(gold>=300) {
				AoNinventory = true;
				System.out.println("You have successfully purchased the Armor of Noob");
				System.out.println("");
				return 3;
			}else{
				System.out.println("You cannot afford the Armor of Noob");
				System.out.println("");
				return 0;
		}
		}else {
			System.out.println("You already own the Armor of Noob");
			System.out.println("");
			return 0;
	}}
	else { 
		System.out.println("Invalid option, please reopen shop");
		System.out.println("");
		return 0;}
	}
	
	
	public int equipWeapon(String d) {
		if(d == "BLADEOFDESTINY") {
		if(BoDinventory == true){
			weaponDamage = 100;
			return 100;
		}else{
			System.out.println("You do not own a Blade of Destiny, please equip a different weapon or "
					+ "weapon damage will be set to 0");
			return 0;
		}}else if(d == "HOMEWRECKER") {
			if(HWinventory == true){
				weaponDamage = 80;
				return 80;
			}else{
				System.out.println("You do not own a Homewrecker, please equip a different weapon or "
						+ "weapon damage will be set to 0");
				return 0;
			}
		}else 
			System.out.println("No such item found");
			return 0;
	}
	public int equipItem(String d) {
		if(d == "ARMOROFNOOB") {
		if(AoNinventory == true){
			armorHP = 300;
			return 300;
		}else{
			System.out.println("You do not own Armor of Noob, please equip a different set of Armor or "
					+ "bonus HP will be set to 0");
			return 0;
		}}else 
			System.out.println("No such item found");
			return 0;
	}
}
