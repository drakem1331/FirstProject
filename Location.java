package pokemon;
import java.util.Scanner;

public class Location {
	Scanner scanner = new Scanner(System.in);
	int xCoord;
	int yCoord;
	
	Location(int x, int y){
		xCoord=x;
		yCoord=y;
	}
	public void setLocation(int x, int y){
		xCoord=x;
		yCoord=y;
	}
	public void move() {
		for(int i = 0; i<1000;i++) {
			String direction = scanner.next();
			String directionUpperCase = direction.toUpperCase();
			if(directionUpperCase.equals("NORTH")) {
				if(yCoord<5) {
					yCoord=yCoord+1;
					System.out.println("You went North");
					break;
				}else {
					System.out.println("An impenetrable wall of trees blocks your path");
				}
			}
			else if(directionUpperCase.equals("EAST")) {
				if(xCoord<5) {
					xCoord=xCoord+1;
					System.out.println("You went East");
					break;
				}else {
					System.out.println("An impenetrable wall of mountains blocks your path");
				}
			}
			else if(directionUpperCase.equals("SOUTH")) {
				if(yCoord>1) {
					yCoord=yCoord-1;
					System.out.println("You went South");
					break;
				}else {
					System.out.println("An impenetrable wall of mountains blocks your path");
				}
			}
			else if(directionUpperCase.equals("WEST")) {
				if(xCoord>1) {
					xCoord=xCoord-1;
					System.out.println("You went West");
					break;
				}else {
					System.out.println("An impenetrable wall of trees blocks your path");
				}
			}else {
				System.out.println("Invalid option: Please type 'north', 'east', 'south', or 'west'");
			}
		}
		}
		
	public int checkLocation() {
		return yCoord*5+xCoord;
	}
}
