package se.lexicon.anton.Arena_Fighter.models;

import se.lexicon.anton.Arena_Fighter.utilities.RandomNumberGenerator;

public class Round {

	private Fighter fighter;
	private Opponent opponent;
	private int fighterAttack;
	private int opponentAttack;
	private int fighterSpeed;
	private int opponentSpeed;

	public Round(Fighter fighter, Opponent opponent) {
		
		this.fighter = fighter;
		this.opponent = opponent;
		this.setFighterAttack();
		this.setFighterSpeed();
		this.setOpponentSpeed();
	}
	
	public void theRound() {

		if (getFighterSpeed() > getOpponentSpeed()) {

			int damage = getFighterAttack() - getOpponentAttack();
			System.out.println(fighter.getName() + " attacks and " + opponent.getName() +
					" takes " + damage + " total damage!");
			System.out.println(fighter.getName() + " speed: " + getFighterSpeed()
			+ " " + opponent.getName() + " speed: " + getOpponentSpeed() + ".");
			opponent.setHp(getOpponentAttack() - getFighterAttack());
			
		} else if (getFighterSpeed() < getOpponentSpeed()) {
			
			int damage = getFighterAttack() - getOpponentAttack();
			System.out.println(opponent.getName() + " attacks and " + fighter.getName() +
					" takes " + damage + " total damage!");
			System.out.println(fighter.getName() + " speed: " + getFighterSpeed()
			+ " " + opponent.getName() + " speed: " + getOpponentSpeed() + ".");
			fighter.setHp(getOpponentAttack() - getFighterAttack());
			
		} else {
			System.out.println(fighter.getName() + " and " + opponent.getName() +
					" are fighting for their lifes!");
			System.out.println("The fight continues...");
		}
	}

	public int getFighterAttack() {
		return fighterAttack;
	}

	public void setFighterAttack() {
		this.fighterAttack = fighter.getStr() + RandomNumberGenerator.getRandomNumber(1, 6);
	}

	public int getOpponentAttack() {
		return opponentAttack;
	}

	public void setOpponentAttack() {
		this.opponentAttack = opponent.getStr() + RandomNumberGenerator.getRandomNumber(1, 6);
	}

	public int getFighterSpeed() {
		return fighterSpeed;
	}

	public void setFighterSpeed() {
		this.fighterSpeed = fighter.getSpeed() + RandomNumberGenerator.getRandomNumber(1, 6);
	}

	public int getOpponentSpeed() {
		return opponentSpeed;
	}

	public void setOpponentSpeed() {
		this.opponentSpeed = opponent.getSpeed() + RandomNumberGenerator.getRandomNumber(1, 6);
	}
}
