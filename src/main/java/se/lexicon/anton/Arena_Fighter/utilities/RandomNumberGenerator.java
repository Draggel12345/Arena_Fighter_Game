package se.lexicon.anton.Arena_Fighter.utilities;

import java.util.Random;

public class RandomNumberGenerator {
	
	private static Random rand = new Random();
	
	public static int getRandomNumber(int min, int max) {
		return rand.nextInt((max - min) + 1) + min;
	}
	
}
