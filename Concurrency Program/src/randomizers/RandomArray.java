package randomizers;

import java.util.ArrayList;
import java.util.Random;

public class RandomArray {
	private ArrayList<Long> randomArray;
	
	public RandomArray (long arrayLength) {
		setRandomArray(arrayLength);
	}
	
	public ArrayList<Long> getRandomArray() {
		return randomArray;
	}
	public void setRandomArray(ArrayList<Long> randomArray) {
		this.randomArray = randomArray;
	}
	public void setRandomArray(long arrayLength) {
		this.randomArray = new ArrayList<Long>();
		Random randomGen = new Random();
		
		for(long counter = 0; counter < arrayLength; counter++) {
			randomArray.add(randomGen.nextLong());
		}
	}
}
