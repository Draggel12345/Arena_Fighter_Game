package se.lexicon.anton.Arena_Fighter.models;

import java.util.ArrayList;
import java.util.List;

import se.lexicon.anton.Arena_Fighter.utilities.RandomNumberGenerator;

//import java.util.List;

public class Fighter {

	private String name;
	private int speed;
	private int str;
	private int hp;
	private int score;
	private boolean retired;
	private StringBuilder fighterInfo;
	private List<Battle> battles;

	public Fighter(String name) {
		this.setName(name);
		this.setSpeed(RandomNumberGenerator.getRandomNumber(5, 6));
		this.setStr(RandomNumberGenerator.getRandomNumber(8, 10));
		this.setHp(RandomNumberGenerator.getRandomNumber(60, 100));
		this.battles = new ArrayList<Battle>();
	}

	public void addScore() {
		this.score += 500;
	}

	public void loseScore() {
		this.score -= 1000;
	}

	public boolean isRetired() {
		return retired;
	}

	public void retired() {
		this.retired = true;
	}

	public boolean isAlive() {
		if (this.hp <= 0) {
			return false;
		}

		return true;
	}

	public void getFighterInfo() {
		this.fighterInfo = new StringBuilder();

		fighterInfo.append("Fighters-Name: " + this.getName() + "\n");
		fighterInfo.append("Fighters-Strenght: " + this.getStr() + "\n");
		fighterInfo.append("Fighters-Health: " + this.getHp() + "\n");
		fighterInfo.append("Fighters-Score: " + this.getScore() + "\n");
		fighterInfo.append("Fighters number of battles: " + this.getBattles().size());
		System.out.println(fighterInfo);
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score += score;
	}

	public List<Battle> getBattles() {
		return battles;
	}
	
	public void addBattle(Battle battle) {
		battles.add(battle);
	}
}
