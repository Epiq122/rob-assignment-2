package com.coderscampus;

import java.util.Random;

public class RandomNumber {

	
		int randomNumberGenerator() {
		Random random = new Random();
		int max = 100;
		int min = 1;
		int showRandom = min + random.nextInt(max);
		return showRandom;
		
	}
}
