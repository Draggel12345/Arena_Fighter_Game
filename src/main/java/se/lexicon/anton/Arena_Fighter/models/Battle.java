package se.lexicon.anton.Arena_Fighter.models;

import java.util.ArrayList;
import java.util.List;

public class Battle {
	
	private Fighter fighter;
	private Opponent opponent;
	private List<Round> rounds;
	
	public Battle(Fighter fighter, Opponent opponent) {
		this.fighter = fighter;
		this.opponent = opponent;
		this.rounds = new ArrayList<Round>();
	}
	
	public void fight() {
		
		boolean fighting = true;
		
		System.out.println(fighter.getName() + " you will fight:\n");
		opponent.getOpponentInfo();
		System.out.println("Let the battle begin!\n");
		
		while(fighting) {
			
			Round round = new Round(fighter, opponent);
			round.theRound();
			
			System.out.println();
			fighter.getFighterInfo();
			System.out.println();
			opponent.getOpponentInfo();
			
			addRound(round);
			
			if((opponent.getHp() <= 0)) {
				System.out.println(fighter.getName() 
						+ " you defeated " + opponent.getName() + "!!!");
				System.out.println("And you won 500 points!");
				System.out.println();
				fighting = false;
				fighter.addBattle(this);
				fighter.addScore();
			} else if((fighter.getHp() <= 0)) {
				System.out.println(fighter.getName() 
						+ " you were defeated by " + opponent.getName() + "...");
				System.out.println("And you lost 1000 points.");
				System.out.println();
				fighting = false;
				fighter.loseScore();
			} else {
				System.out.println("A new round begins!");
			}
		}
	}
	
	public Fighter getFighter() {
		return fighter;
	}
	
	public Opponent getOpponent() {
		return opponent;
	}
	
	public List<Round> getRounds() {
		return rounds;
	}
	public void addRound(Round round) {
		rounds.add(round);
	}
	
	
}
