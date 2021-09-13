package pokemon;
import java.util.Scanner;

public class MoriaMain {
	
	public static void main(String[] args) {
		Interface playerUI = new Interface();
		System.out.println("What is your name?");
		Player player = new Player(15, 300, 300);
		String playerName=player.setName();
		System.out.println("You have encountered a wild Infernal on your first day in the town"
				+ " and must fight to defend the town!");
		MoriaBattleInfernal infernal = new MoriaBattleInfernal(player.getDamage(), player.getMaxHP(), player.getHealth());
		infernal.moriaFightEasy();
		playerUI.earnGold(25);
		System.out.println("Thomas: \"I am Thomas, fighter of great prowess. Congratulations on your first victory against the deep. "
			+ "There is much you need to learn if you hope to stand against the growing darkness.\"\nType next to continue the story");
		Scanner scanner=new Scanner(System.in);
		Boolean next = false;
		String rawNext = scanner.next();
		String nextTest = rawNext.toUpperCase();
		do {
			switch(nextTest) {
				case "NEXT":
				next = true;
				break;
				default:
				System.out.println("Please enter next to continue the story");
				rawNext = scanner.next();
				nextTest = rawNext.toUpperCase();
				break;}	
		}while(next==false);
		player.resetStats();
		System.out.println("Thomas: \"You have already faced the Great Infernal, but it likely took a few tries. Only I can train you to fight the legendary"
				+ " Xan\"");
		System.out.println("Thomas: \"Fight me to prove your skills in combat! You won't be successful unless you know how to calm your inner soul and MEDITATE"
				+ "\"\nType next to continue the story");
		next = false;
		rawNext = scanner.next();
		nextTest = rawNext.toUpperCase();
		do {
			switch(nextTest) {
				case "NEXT":
				next = true;
				break;
				default:
				System.out.println("Please enter next to continue the story");
				rawNext = scanner.next();
				nextTest = rawNext.toUpperCase();
				break;}
		}while(next==false);
		MoriaBattleThomas thomas = new MoriaBattleThomas(player.getDamage(), player.getMaxHP(), player.getHealth());
		int currentHP = thomas.moriaFight();
		player.setStats(playerUI.getDamage(), playerUI.getMaxHP(), currentHP);
		playerUI.setStats(playerUI.getDamage(), playerUI.getMaxHP(), currentHP);
		playerUI.earnGold(5);
		System.out.println("Thomas: \""+playerName+", well fought my young pupil\"");
		System.out.println("You have unlocked the commands \"shop\", \"equip\", \"train\", \"move\", \"inventory\", \"heal\" and \"c\" to use at your convenience outside of dialog.\nSome of these can only be used at the town. To continue the story type \"next\".");
		playerUI.playerInterface();
		
		}		
}
