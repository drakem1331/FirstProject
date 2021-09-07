package pokemon;

public class Inventory {
	Boolean BoDinventory = false;
	Boolean HWinventory = false;
	int weaponDamage = 0;
	
	public void setBoDInventory() {
			BoDinventory = true;
	}
	public void setHWInventory() {
			HWinventory = true;
	}
	
	public void displayInventory() {
		System.out.println("Your inventory contains: ");
		if(BoDinventory==true) {
			System.out.println("Blade of Destiny");
		}
		if(HWinventory==true) {
			System.out.println("Homewrecker");
		}
	}

	public int purchaseWeapon(char d, int gold) {
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
			return 0;
		}}else { 
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
			System.out.println("No such weapon found");
			return 0;
	}}
