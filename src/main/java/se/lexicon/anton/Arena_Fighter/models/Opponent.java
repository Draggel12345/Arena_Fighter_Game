package se.lexicon.anton.Arena_Fighter.models;

import se.lexicon.anton.Arena_Fighter.utilities.RandomNameGenerator;
import se.lexicon.anton.Arena_Fighter.utilities.RandomNumberGenerator;

public class Opponent {

	private String name;
	private int speed;
	private int str;
	private int hp;
	private StringBuilder opponentInfo;

	public Opponent() {
		this.setName(RandomNameGenerator.getRandomName(1));
		this.setSpeed(RandomNumberGenerator.getRandomNumber(4, 5));
		this.setStr(RandomNumberGenerator.getRandomNumber(7, 10));
		this.setHp(RandomNumberGenerator.getRandomNumber(60, 100));
	}

	public boolean isAlive() {
		if (this.hp <= 0) {
			return false;
		}

		return true;
	}

	public void getOpponentInfo() {
		this.opponentInfo = new StringBuilder();

		opponentInfo.append("Opponents-Name: " + this.getName() + "\n");
		opponentInfo.append("Opponents-Strenght: " + this.getStr() + "\n");
		opponentInfo.append("Opponents-Health: " + this.getHp() + "\n");
		System.out.println(opponentInfo);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed += speed;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str += str;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp += hp;
	}
}
