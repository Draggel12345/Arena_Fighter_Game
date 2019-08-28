package se.lexicon.anton.Arena_Fighter;

import java.util.Scanner;

import se.lexicon.anton.Arena_Fighter.models.Battle;
import se.lexicon.anton.Arena_Fighter.models.Fighter;
import se.lexicon.anton.Arena_Fighter.models.Opponent;

public class App {
	
	private static Fighter fighter;
	private Opponent opponent;
	private Battle battle;

	private static final Scanner sr = new Scanner(System.in);
	
	public static void main(String[] args) {

		App app = new App();
		fighter = new Fighter("");
		boolean run = true;
		boolean dead = (fighter.getHp() <= 0);
		String name;
		String choice;
		
		System.out.println("WELCOM TO ARENA FIGHTER!!!");
		System.out.println();
		System.out.println("The rules are as follow:");
		System.out.println("You the player have two choices, fight or retire.");
		System.out.println("If you choose to fight," +
				" you will meet an opponent in the arena!");
		System.out.println("You can choose to retire with your fighter" +
				" and get your fighters history AND a bonus!");
		System.out.println("But after that, it will be game over.");
		System.out.println();
		
		System.out.println("Please enter your fighters name:");
		name = sr.nextLine();
		fighter.setName(name);
		System.out.println();
		System.out.println("Welcome " + name + " to the arena!\n");
		
		while(run) {
			
			System.out.println("These are your fighters stats:");
			fighter.getFighterInfo();
			System.out.println();
			
			System.out.println("Now make your choice.");
			System.out.println("Enter (F) to fight.");
			System.out.println("Enter (R) to retire.");
			choice = sr.nextLine();
			
			switch(choice.toLowerCase()) {
			
			case "f" : app.fight();
			break;
			
			case "r" : app.retire();
			run = false;
			break;
			
			default : System.out.println("INVALID INPUT. TRY AGAIN!");
			break;
			}
			
			if(dead) {
				System.out.println(fighter.getName() + " died in battle...");
				run = false;
			}
			
		}
		
		app.fighterHistory();
		sr.close();
		
	}
	
	void fight() {
		
		opponent = new Opponent();
		battle = new Battle(fighter, opponent);
		battle.fight();
	}

	void retire() {
		
		System.out.println(fighter.getName() + " has now retired.");
		fighter.addScore();
	}
	
	void fighterHistory() {

		for (Battle battle : (fighter.getBattles())) {
			System.out.println(battle.getOpponent().getName() +
					" was killed in " + battle.getRounds().size() + " rounds!");
			System.out.println();
		}
		
		System.out.println(fighter.getName() +
				" got 500 points for every battle and was victorius in " +
				fighter.getBattles().size() + " battles");
		
		if(!(fighter.getHp() <= 0)) {
			System.out.println(fighter.getName() +
					" retired undefeated, earning a bonus of 500 point!");
		}
		
		System.out.println("Total score = " + fighter.getScore());
	}
}
