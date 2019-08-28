package se.lexicon.anton.Arena_Fighter.utilities;

import java.util.Random;

public class RandomNameGenerator {

    private static String[] names = {"Kai", "Kalista", "Thor", "Garen", "Ashe",
			"Olaf", "Draven", "Darius", "Katarina", "Evelynn", "Amumu", "Kayn", "Vayne",
			"Brand", "Atrox", "Lux", "Bard", "Jhin", "Diana", "Leona", "Teemo", "Gnar"};
	
    private static Random rand = new Random();
    
	public static String getRandomName(int name) {
		
		String randomName = "";
		
		for(int i = 1; i <= name; i++) {
			
			int random = rand.nextInt(names.length - 1) + 1;
			randomName += names[random] + "";
		}
		
		return randomName;
	}
}
