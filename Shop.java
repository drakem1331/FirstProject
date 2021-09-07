package pokemon;
import java.util.Scanner;

public class Shop {
	int goldPieces=0;
	Inventory inventoryTester = new Inventory();
	
	public int goldCount() {
		return goldPieces;
	}
	public void earnGold(int gold) {
		goldPieces=goldPieces+gold;
		System.out.println("You have earned "+gold+" gold for a total of "+goldPieces+" gold in your wallet");
	}
	
	public int openShop() {
		var scanner=new Scanner(System.in);
		System.out.println("Thomas: \"Welcome to the Shop\"");
		System.out.println("A. Blade of Destiny (100 damage) - 30 Gold");
		System.out.println("B. Homewrecker (80 damage) - 15 Gold");
		System.out.println("C. Armour of Noob (200 HP) - 300 Gold");
		System.out.println("D. Exit the Shop");
		Boolean next = false;
		do {
			String cost = scanner.next();
			String fullCost = cost.toUpperCase();
			switch(fullCost) {
				case "A":
				int test = inventoryTester.purchaseWeapon('a', goldPieces);
				if(test==1) {
					goldPieces=goldPieces-30;
					System.out.println("You now have "+goldPieces+" gold left.");
					System.out.println();
					inventoryTester.setBoDInventory();
					return 1;
				}else{return 0;}
				case "B":
				int test1 = inventoryTester.purchaseWeapon('b', goldPieces);
				if(test1==2) {
					goldPieces=goldPieces-15;
					System.out.println("You now have "+goldPieces+" gold left.");
					System.out.println();
					inventoryTester.setHWInventory();
					return 2;
				}else{return 0;}
				case "C":
				int test2 = inventoryTester.purchaseWeapon('c', goldPieces);
				return 0;
				default:
				System.out.println("Thanks for visiting the Shop!");
				next = true;}
	}while(next==false);
		return 0;
	
	
	}
}

